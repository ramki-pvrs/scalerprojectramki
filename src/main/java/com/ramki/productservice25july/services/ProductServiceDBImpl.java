package com.ramki.productservice25july.services;

import com.ramki.productservice25july.models.Product;
import com.ramki.productservice25july.repositories.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ramki.productservice25july.models.*;
import org.springframework.context.annotation.Primary;

@Service
@Primary
public class ProductServiceDBImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceDBImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        //return null;
        Product savedProduct = productRepository.save(product);

        return savedProduct;
    }
}
