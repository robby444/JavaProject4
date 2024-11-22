package org.example.entities;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
public class Clothing extends Product {
    private String color;
    public Clothing(String name, double price, String description) {
        super(name, price, description);
        this.color = color;
    }
}
