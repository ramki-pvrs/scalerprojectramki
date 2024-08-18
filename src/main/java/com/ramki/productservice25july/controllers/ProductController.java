package com.ramki.productservice25july.controllers;

import org.springframework.web.bind.annotation.*;

//url query params vs body params

//Decorator Design Patter
@RestController

//the above annotation makes this class as a router for all product related url patterns
//Dispatcher Servlet considers this as one potential router for received request
//every request, url, is handled by a method
public class ProductController {

    @PostMapping("/products/")
    public void createProduct() {

    }

    @GetMapping("/products/")
    public void getAllProducts() {

    }

    @GetMapping("/products/{id}")
    public String getSingleProduct(@PathVariable("id") Long id) {
        return "Here is your product " + id ;
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct() {

    }

    //for Naman Http Type
    //Postman
    //In HTTP Method section Type a new method NAMAN
    //urL: http://localhost:8080/products/1
    //you shd see in Postman response some Magic return value
    @RequestMapping(name = "NAMAN", value = "/products/{id}")
    public String someCustomMethod() {
        //may get something about the product and compare it to something else
        //return some thind unquie to Naman Http Req type

        return "some Magic return value";
    }
}
