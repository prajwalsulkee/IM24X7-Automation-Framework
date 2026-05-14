package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.openMenu();

        inventoryPage.logOut();

        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"));


    }
}
