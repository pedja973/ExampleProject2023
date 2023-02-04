package Pages;

import io.opentelemetry.api.internal.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInPage {


    public WebDriver driver;

    public By userNameField = By.id("user-name");

    public By passwordField = By.id("password");

    public By logInButton = By.id("login-button");


    public By errorMessage = By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");


    public LogInPage(WebDriver driver){this.driver = driver;}

    public void enterUserName (String textToEnterToUserNameField){
        driver.findElement(userNameField).sendKeys(textToEnterToUserNameField);
    }

    public void enterPassword(String textToEnterToPasswordField){
        driver.findElement(passwordField).sendKeys(textToEnterToPasswordField);
    }

    public void clickOnLogInButton(){
        driver.findElement(logInButton).click();
    }

    public String getErrorMessageText(){
        return driver.findElement(errorMessage).getText();
    }


}
