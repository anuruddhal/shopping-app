package com.mycompany.app.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * Product entity.
 */
@Data
@NoArgsConstructor
public class Product {
    private String title;
    private String name;
    private double price;
    private double tax;

    public Product(String title, String name, double price, double tax) {
        this.title = title;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Double.compare(product.getTax(), getTax()) == 0 && Objects.equals(getTitle(), product.getTitle()) && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getName(), getPrice(), getTax());
    }
}
