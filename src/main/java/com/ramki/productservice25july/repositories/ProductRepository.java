package com.ramki.productservice25july.repositories;

import com.ramki.productservice25july.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository //because JpaRepository itself a Repository object, not mandataoty to use this annotation but good practice
public interface ProductRepository extends JpaRepository<Product, Long> {

    //p does not have id, but the returned product after it is saved in dB will have a id
    //both Insert and Update SQL commands are dealt by this save method
    @Override
    Product save(Product p);


    @Override
    void delete(Product p);

}
