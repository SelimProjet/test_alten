package com.shop.product.service;


import com.shop.product.bean.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Long id);

    Optional<Product> findByName(String name);

    List<Product> findAll();

    Product save(Product entity);

    Product update(Product product);

    void deleteById(Long id);
}
