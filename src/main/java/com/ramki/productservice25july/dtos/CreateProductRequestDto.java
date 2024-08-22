package com.ramki.productservice25july.dtos;


import com.ramki.productservice25july.models.Category;
import com.ramki.productservice25july.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDto {
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String categoryName;

    public Product toProduct() {
        Product product = new Product();

        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setImageUrl(imageUrl);

        Category category = new Category();
        category.setName(categoryName);

        product.setCategory(category);

        return product;
    }


}
