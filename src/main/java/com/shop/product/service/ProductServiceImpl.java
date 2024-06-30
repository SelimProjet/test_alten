package com.shop.product.service;

import com.shop.product.bean.Product;
import com.shop.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    public Optional<Product> findById(Long id) {

        return productRepository.findById(id);
    }

    public Optional<Product> findByName(String name){

        return productRepository.findByName(name);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product entity) {
        return productRepository.save(entity);
    }

    public Product update(Product product) {

        return this.productRepository.save(product);
    }

    public void deleteById(Long id) {

        productRepository.deleteById(id);
    }

}
