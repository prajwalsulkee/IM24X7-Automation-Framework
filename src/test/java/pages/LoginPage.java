package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locate elements
    By UserName = By.cssSelector("input[id=\"user-name\"]");
    By Password = By.xpath("//input[@name=\"password\"]");
    By Login = By.id("login-button");
    By errorMessage = By.cssSelector("h3[data-test=\"error\"]");


    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterUserName(String setUserName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserName)).sendKeys(setUserName);
    }

    private void enterPassword(String setPassword){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Password)).sendKeys(setPassword);
    }

    private void clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(Login)).click();
    }

    public void login(String setUserName, String setPassword){
        enterUserName(setUserName);
        enterPassword(setPassword);
        clickLogin();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }


}
