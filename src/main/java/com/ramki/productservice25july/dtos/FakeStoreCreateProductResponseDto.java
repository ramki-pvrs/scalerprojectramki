package com.ramki.productservice25july.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreCreateProductResponseDto {
    //this is a 3rd party api response params
    private Long id; //sent by the 3rd party API response; refer FakeStore API doc
    private String title;
    private String description;
    private double price;
    private String image; //not imageUrl because this is for 3rd party param name
    private String category; //not categoryName because this is for 3rd party param name


}
