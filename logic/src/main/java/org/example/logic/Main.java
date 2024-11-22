package org.example.logic;

import com.github.javafaker.Faker;

import java.util.stream.IntStream;

import org.example.entities.*;

public class Main {
    public static void main(String[] args) {
        var faker = new Faker();

        Product product = Product.builder()
                .name(faker.commerce().productName())
                .price(Double.parseDouble(faker.commerce().price().replace(",", ".")))
                .description(faker.commerce().color())
                .build();

        Clothing clothing = Clothing.builder()
                .name(faker.commerce().productName())
                .price(Double.parseDouble(faker.commerce().price().replace(",", ".")))
                .description(faker.commerce().color())
                .color(faker.commerce().color())
                .build();

        Electronics electronics = Electronics.builder()
                .name(faker.commerce().productName())
                .price(Double.parseDouble(faker.commerce().price().replace(",", ".")))
                .description(faker.commerce().color())
                .brand(faker.company().name())
                .build();


        System.out.println(product);
        System.out.println(clothing);
        System.out.println(electronics);


        var clothingList = IntStream.range(0, 1000).mapToObj(i -> Clothing.builder()
                        .name(faker.commerce().productName())
                        .price(Double.parseDouble(faker.commerce().price().replace(",", ".")))
                        .description(faker.lebowski().quote())
                        .color(faker.commerce().color())
                        .build())
                .toList();

        clothingList.parallelStream()
                .map(OrderProcessor::new)
                .forEach(OrderProcessor::process);
    }
}