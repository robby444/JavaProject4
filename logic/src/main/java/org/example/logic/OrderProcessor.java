package org.example.logic;

import org.example.entities.Product;

public class OrderProcessor<T extends Product> {
    private T product;

    public OrderProcessor(T product) {
        this.product = product;
    }

    public void process() {
        System.out.println("Processing order for: " + product.getName());
        System.out.println("Processing product in thread: " + Thread.currentThread().getName());
    }

    public void startProcessing() {
        Runnable task = () -> System.out.println("Processing product in thread: " + Thread.currentThread().getName());
        new Thread(task).start();
    }
}

