package com.ramki.productservice25july.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    private String title;
    private String description;
    private double price;
    private String imageUrl;

    //current class to other class
    //1 product : 1 category
    // M products        : 1 Category
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Category category;
}
