package com.ramki.productservice25july.dtos;


import com.ramki.productservice25july.models.Product;
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

    public static CreateProductResponseDto fromProduct(Product product) {
        CreateProductResponseDto responseDto = new CreateProductResponseDto();

        responseDto.setTitle(product.getTitle());
        responseDto.setDescription(product.getDescription());
        responseDto.setPrice(product.getPrice());
        responseDto.setImageUrl(product.getImageUrl());
        responseDto.setCategoryName(product.getCategoryName());

        return responseDto;

    }
}
