package com.ramki.productservice25july.services;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceDBImpl implements ProductService {

    @Override
    public void createProduct(String title,
            String description,
            double price,
            String category,
            String imageUrl) {};
}
