package org.example.entities;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
public class Electronics extends Product {
    private String brand;
    public Electronics(String name, double price, String description, String brand) {
        super(name, price, description);
        this.brand = brand;
    }
}
