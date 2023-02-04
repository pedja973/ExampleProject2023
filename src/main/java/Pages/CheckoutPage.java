package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    public WebDriver driver;

    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By postalCode = By.id("postal-code");

    public By cancelButton = By.id("cancel");

    public By proceedButton = By.id("continue");

    public CheckoutPage(WebDriver driver){this.driver = driver;}

    public void enterFirstName (String textToEnterFirstName){
        driver.findElement(firstName).sendKeys(textToEnterFirstName);
    }

    public void enterLastName(String textToEnterLastName){
        driver.findElement(lastName).sendKeys(textToEnterLastName);
    }

    public void enterZipCode(String textToEnterToPasswordField){
        driver.findElement(postalCode).sendKeys(textToEnterToPasswordField);
    }

    public void proceed () {driver.findElement(proceedButton).click();}
    public void cancel () {driver.findElement(cancelButton).click();}




}
