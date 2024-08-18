package com.ramki.productservice25july.services;

import com.ramki.productservice25july.models.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceDBImpl implements ProductService {



    @Override
    public Product createProduct(Product product) {
        return product;
    }
}
