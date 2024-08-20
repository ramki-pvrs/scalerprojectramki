package com.ramki.productservice25july.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


//Spring on start will find all @Configuration classes
//run all @Bean methods in them and store the returned objects in Spring Container or App context

@Configuration
public class ApplicationConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
