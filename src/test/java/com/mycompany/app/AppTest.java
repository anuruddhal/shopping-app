package com.mycompany.app;

import com.mycompany.app.models.Product;
import com.mycompany.app.models.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Product rice = new Product("Rice", "Samba Rice", 100.00, 5.0D);
    Product dal = new Product("Dal", "Red Dal", 100.50, 10D);

    @Test
    public void testShoppingCart() {
        ShoppingCart cart1 = new ShoppingCart();
        // Single product
        cart1.addProduct(rice, 1D);
        Assert.assertEquals(String.format("%.2f", 155.00), String.format("%.2f", cart1.getTotal()));

        // Same product added twice
        cart1.addProduct(rice, 1D);
        Assert.assertEquals(String.format("%.2f", 155.00), String.format("%.2f", cart1.getTotal()));

        // Multiple products added.
        cart1.addProduct(dal, 1.5D);
        Assert.assertEquals(String.format("%.2f", 320.75), String.format("%.2f", cart1.getTotal()));
    }
}
