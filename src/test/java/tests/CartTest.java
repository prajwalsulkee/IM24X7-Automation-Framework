package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CartTest extends BaseTest {

    @Test
    public void addItemToCart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addItemTOCart();

        Assert.assertEquals(inventoryPage.getCartBadgeCount(),"1");

        inventoryPage.openCart();

        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(cartPage.getCartItemName(),"Sauce Labs Backpack");
    }
}
