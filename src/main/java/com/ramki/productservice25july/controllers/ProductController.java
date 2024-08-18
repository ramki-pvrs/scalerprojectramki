package com.ramki.productservice25july.controllers;

import com.ramki.productservice25july.dtos.CreateProductRequestDto;
import com.ramki.productservice25july.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

//url query params vs body params
//to pass around data you need DTOs
//Data Transfer Object : receive information in client request;
//or send data to client after internal processing

//why you dont use Entity object
//Entity object may have more information than required like user password
//you dont want to passing it around
//DTO is subset typically (may be joined valued??)

//services are typically interfaces

//Decorator Design Patter
@RestController

//the above annotation makes this class as a router for all product related url patterns
//Dispatcher Servlet considers this as one potential router for received request
//every request, url, is handled by a method
//whatever the common part of the url pattern, can be pulled out of each method
//and added at the top

@RequestMapping("/products")
public class ProductController {

    //@Value("${productService}")
    private String productServiceType;


    private ProductService productService;

    //
    //this Class's constructor
    //Spring Dependency (Constructor) injection and Inversion of Control
    //Spring will pass productService object
    //I dont have to do new ProductService anywhere

    //Field Level injection is not good and not recommended due to complexties and maintenance of code


    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //@PostMapping("/products/")
    @PostMapping("/")
    public String createProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return "THe product price is " + createProductRequestDto.getPrice();
    }

    //@GetMapping("/products/")
    @GetMapping("/")
    public void getAllProducts() {

    }

    //@GetMapping("/products/{id}")
    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") Long id) {
        return "Here is your product " + id ;
    }

    //@DeleteMapping("/products/{id}")
    @DeleteMapping("/{id}")
    public void deleteProduct() {

    }

    //for Naman Http Type
    //Postman
    //In HTTP Method section Type a new method NAMAN
    //urL: http://localhost:8080/products/1
    //you shd see in Postman response some Magic return value
   // @RequestMapping(name = "NAMAN", value = "/products/{id}")
    @RequestMapping(name = "NAMAN", value = "/{id}")
    public String someCustomMethod() {
        //may get something about the product and compare it to something else
        //return some thind unquie to Naman Http Req type

        return "some Magic return value";
    }
}
