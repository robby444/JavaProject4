package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@SuperBuilder
@ToString
public class Product {
    private String name;
    private double price;
    private String description;
}
