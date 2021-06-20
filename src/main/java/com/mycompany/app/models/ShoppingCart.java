package com.mycompany.app.models;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Shopping Cart model.
 */
@Data
public class ShoppingCart {
    private double shipmentCost;
    // Map to hold product and  quantity
    private Map<Product, Double> productList;

    public ShoppingCart() {
        //Initialize default values.
        this.shipmentCost = 50.00;
        this.productList = new HashMap<>();
    }

    public void addProduct(Product product, Double quantity) {
        this.productList.put(product, quantity);
    }

    /**
     * Calculate total value with tax and shipment cost
     *
     * @return Net Total
     */
    public double getTotal() {
        double total = 0;
        for (Map.Entry<Product, Double> entry : productList.entrySet()) {
            Product product = entry.getKey();
            Double quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total + this.getShipmentCost() + this.getVat();
    }

    public double getVat() {
        double vat = 0;
        for (Map.Entry<Product, Double> entry : productList.entrySet()) {
            Product product = entry.getKey();
            Double quantity = entry.getValue();
            vat += product.getTax() * quantity;
        }
        return vat;
    }

    public double getShipmentCost() {
        return this.shipmentCost;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "total=" + getTotal() +
                ", vat=" + getVat() +
                ", shipmentCost=" + getShipmentCost() +
                ", productList=" + productList +
                '}';
    }
}
