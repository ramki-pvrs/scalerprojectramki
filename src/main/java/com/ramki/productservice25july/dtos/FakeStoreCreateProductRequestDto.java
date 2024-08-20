package com.ramki.productservice25july.dtos;

import lombok.Getter;
import lombok.Setter;


//a dto to map internal product param names to external system param names (FakeStore is the external here)
@Getter
@Setter

public class FakeStoreCreateProductRequestDto {
    private String title;
    private String description;
    private double price;
    private String image; //not imageUrl because this is for 3rd party param name
    private String category; //not categoryName because this is for 3rd party param name


}
