package com.mycompany.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

/**
 * Customer entity.
 */
@Data
@AllArgsConstructor
public class Customer {
    private String name;
    private ShoppingCart shoppingCart;

    public Customer(String name) {
        this.name = name;
    }

    private Optional<ShoppingCart> getShoppingCart() {
        return Optional.ofNullable(this.shoppingCart);
    }

    @Override
    public String toString() {
        return "Customer{" +
                " name='" + name + '\'' +
                ",shoppingCart=" + getShoppingCart() +
                '}';
    }
}
