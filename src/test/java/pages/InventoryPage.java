package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {

    WebDriver driver;
    WebDriverWait wait;

    public InventoryPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locate elements

    By MenuButton = By.id("react-burger-menu-btn");
    By CartIcon = By.cssSelector(".shopping_cart_link");
    By AddToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By CartBadge = By.cssSelector("span[data-test=\"shopping-cart-badge\"]");
    By LogOutLink = By.id("logout_sidebar_link");

    public boolean isMenuButtonDisplayed(){
        return driver.findElement(MenuButton).isDisplayed();
    }

    public boolean isCartIconDisplayed(){
        return driver.findElement(CartIcon).isDisplayed();
    }

    public void addItemTOCart(){
        wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton)).click();
    }

    public String getCartBadgeCount(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(CartBadge)).getText();
    }

    public void openMenu(){
            wait.until(ExpectedConditions.elementToBeClickable(MenuButton)).click();
    }

    public void logOut(){
        wait.until(ExpectedConditions.elementToBeClickable(LogOutLink)).click();
    }

    public void openCart(){
        wait.until(ExpectedConditions.elementToBeClickable(CartIcon)).click();
    }


}
