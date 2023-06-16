package com.siddiqproductsales.product.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.siddiqproductsales.product.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
