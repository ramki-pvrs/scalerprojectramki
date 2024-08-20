package com.ramki.productservice25july.services;

import com.ramki.productservice25july.dtos.FakeStoreCreateProductRequestDto;
import com.ramki.productservice25july.dtos.FakeStoreCreateProductResponseDto;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.ramki.productservice25july.models.Product;
import org.springframework.web.client.RestTemplate;

//annotate to tell Spring to keep an object of ProductServiceFakestoreImpl in its container
//How do you create a product
//receive the form data from client to Controller
//pass it to Service
//serrvice is an interface which has more than one implementation
//class to create the product in dB
//or class to create the product in 3rd party system (FakeStore in this case as an example)
//if it is 3rd party you have to make an API call again
//thats when SpringBoot Web has  RestTemplate class comes into picture

//restTemplate does not have the Bean object by default in SpringBoot
//so you create a config package and have a Configuration class and inform SpringBoot to load
//thos objects in Spring Container when app starts

//this enables you as developer to create custom Autowired Beans, even though SpringBoot  does not have them by deefault


@Service
@Primary
public class ProductServiceFakestoreImpl implements ProductService {

    private RestTemplate restTemplate; //to create the product in 3rd party app

    //initialy restTemplate in the constructor below will be Red underlined by IntelliJ
    //because configs package with ApplicationConfiguration class is not added by me (ramki as developer)
    //once you add it, it will be OK


    public ProductServiceFakestoreImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product createProduct(Product product) {

        //note that external API url param names may be different from your app param names
        //like in this app Product has imageUrl whereas FakeStore has only image as param name
        //so you have to have a mapping between this app params and external system params
        //being data mapping you will use a dto to achieve this

        FakeStoreCreateProductRequestDto request = new FakeStoreCreateProductRequestDto();
        request.setDescription(product.getDescription());
        request.setPrice(product.getPrice());
        request.setImage(product.getImageUrl()); //different param names; mapped
        request.setTitle(product.getTitle());
        request.setCategory(product.getCategoryName()); //different param names; mapped

        //postForObject takes 3 params; 3rdt party url; request body; response object type (to convert 3rd party params to your app params)
        //this call is to create product in FakeStore app and get its response back
        //with postForObject method call, this is in turn a createProduct request
        //in theory REST API, you dont have method like create in the api call, POST req is meant for it

        FakeStoreCreateProductResponseDto response = restTemplate.postForObject("https://fakestoreapi.com/products"
                                    ,request
                                    , FakeStoreCreateProductResponseDto.class);

        Product product1 = new Product();

        product1.setDescription(response.getDescription());
        product1.setPrice(response.getPrice());
        product1.setCategoryName(response.getCategory());
        product1.setTitle(response.getTitle());
        product1.setImageUrl(response.getImage());

        return product1;
}
