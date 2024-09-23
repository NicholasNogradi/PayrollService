package com.example.Payroll;

public class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) {
        super("Order with id " + id + " not found");
    }
}
