package com.shop.product.bean;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private long quantity;

    @Column(name = "inventory_status")
    private String inventoryStatus;

    @Column(name = "category")
    private String category;

    @Column(name = "image")
    private String image;

    @Column(name = "rating")
    private double rating;
}
