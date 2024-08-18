package com.ramki.productservice25july.services;

import org.springframework.stereotype.Service;

/*

Why service should not take a dto object as input for processing
lets say you login normally with user id and password
another use case where an email is sent you with a link
and when you click you are directly into the app because your email is known

say there is a loginService which is a business logic called from
EmailGiveTesstController
NormalLoginController

then you may have to duplicate the code to address the data required for loginService business logic

so you always use exact parameters required for the business service in service interface method
definitions.

you may use model or builder object but not dto in service

DTOs are tied to a particular controller object means to a particular request

 */

@Service
public interface ProductService {

    //refer the comment above on why we shd not use dto
    void createProduct(String title
                        ,String description
                        ,double price
                         ,String category
                         ,String imageUrl);
}
