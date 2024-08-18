package com.ramki.productservice25july.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//annotate to tell Spring to keep an object of ProductServiceFakestoreImpl in its container
@Service
//@Primary
public class ProductServiceFakestoreImpl implements ProductService {

    @Override
    public void createProduct(String title,
                              String description,
                              double price,
                              String category,
                              String imageUrl) {};
}
