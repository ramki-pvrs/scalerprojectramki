package com.ramki.productservice25july.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.ramki.productservice25july.models.Product;

//annotate to tell Spring to keep an object of ProductServiceFakestoreImpl in its container
@Service
@Primary
public class ProductServiceFakestoreImpl implements ProductService {


    @Override
    public Product createProduct(Product product) {
        return product;
    }
}
