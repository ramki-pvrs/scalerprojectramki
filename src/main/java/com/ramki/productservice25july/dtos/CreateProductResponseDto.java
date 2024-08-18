package com.ramki.productservice25july.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductResponseDto {
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String categoryName;
}
