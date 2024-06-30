package com.shop.product.repository;

import com.shop.product.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(long id);

    Optional<Product> findByName(String name);

    Product save(Product product);

    void deleteById(long id);
}
