package com.ramki.productservice25july.models;

//import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Getter
@Setter
public class Category extends BaseModel {

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> featuredProducts;

    private String specialCategory;

    private int countOfProducts;

}
