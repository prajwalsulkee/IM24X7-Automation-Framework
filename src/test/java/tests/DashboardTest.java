package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class DashboardTest extends BaseTest {

    @Test
    public void dashboardValidation(){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login("standard_user","secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        Assert.assertEquals(driver.getTitle(),"Swag Labs");

        Assert.assertTrue(inventoryPage.isCartIconDisplayed());

        Assert.assertTrue(inventoryPage.isMenuButtonDisplayed());
    }
}
