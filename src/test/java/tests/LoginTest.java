package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest(){

        LoginPage valid = new LoginPage(driver);
        valid.login("standard_user","secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        // Add this to see Screenshot is captured or not?
        // Assert.assertTrue(false);
    }

    @Test
    public void inValidLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("prajwalUser","wrongPassword");

        Assert.assertTrue(loginPage.getErrorMessage().contains("Username and password do not match"));
    }

    @Test
    public void emptyUserNameTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("","secret_sauce");

        Assert.assertTrue(loginPage.getErrorMessage().contains(" Username is required"));
    }

    @Test
    public void emptyPasswordTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","");

        Assert.assertTrue(loginPage.getErrorMessage().contains("Password is required"));
    }

    @Test
    public void emptyUserNameAndPasswordTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("","");

        Assert.assertTrue(loginPage.getErrorMessage().contains("Username is required"));
    }

    @Test
    public void specialCharacterTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("!@#$","%*&$@");

        Assert.assertTrue(loginPage.getErrorMessage().contains("Username and password do not match any user in this service"));
    }

}
