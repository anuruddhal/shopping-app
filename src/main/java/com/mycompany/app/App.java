package com.mycompany.app;

import com.mycompany.app.models.Customer;
import com.mycompany.app.models.Product;
import com.mycompany.app.models.ShoppingCart;

/**
 * Main App.
 */
public class App {
    public static void main(String[] args) {
        // Initialize Products
        Product rice = new Product("Rice", "Samba Rice", 100.00, 5.0D);
        Product dal = new Product("Dal", "Red Dal", 100.50, 10D);

        //Customer 1
        Customer customer1 = new Customer("John Doe");
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(rice, 1D);
        cart1.addProduct(rice, 1.5D);
        customer1.setShoppingCart(cart1);
        System.out.println(customer1);

        //Customer 2
        Customer customer2 = new Customer("Jane Doe");
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addProduct(rice, 1D);
        cart2.addProduct(dal, 2D);
        customer2.setShoppingCart(cart2);
        System.out.println(customer2);
    }
}
