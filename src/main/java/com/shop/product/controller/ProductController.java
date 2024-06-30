package com.shop.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.shop.product.bean.Product;
import com.shop.product.service.ProductServiceImpl;
import java.util.Optional;
import java.util.List;


@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {

        this.productService = productService;
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.FOUND)
    public Optional<Product> findById(@PathVariable long id) {

        return productService.findById(id);
    }

    @GetMapping("/{name}")
    @ResponseStatus(code = HttpStatus.FOUND)
    public Optional<Product> findByName(@PathVariable String name) {

        return productService.findByName(name);
    }

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Product> findAll() {

        return productService.findAll();
    }

    @PostMapping("/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Product save(@RequestBody Product product) {

        return productService.save(product);
    }

    @PatchMapping("/edit/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Product update(@RequestBody Product product, @PathVariable long id) {

        return this.productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteById(@PathVariable long id) {

        productService.deleteById(id);
    }
}
