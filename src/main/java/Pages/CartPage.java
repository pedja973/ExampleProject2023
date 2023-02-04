package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {

    public WebDriver driver;

    public By removeBackPackButton = By.id("remove-sauce-labs-backpack");
    public By removeOneSieButton = By.id("remove-sauce-labs-onesie");
    public By removeShirtRedButton = By.id("remove-test.allthethings()-t-shirt-(red)");
    public By backToShopping = By.id("continue-shopping");

    public By sauceLabsBackpack = By.xpath("//div[text()='Sauce Labs Backpack']");

    public By cartContents = By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");

    public By checkout = By.id("checkout");

    public CartPage(WebDriver driver){this.driver = driver;}

    public void removeBackPack() {driver.findElement(removeBackPackButton).click();}
    public void removeOneSie(){driver.findElement(removeOneSieButton).click();}
    public void removeShirtRed () {driver.findElement(removeShirtRedButton).click();}
    public void continueToCheckout() {driver.findElement(checkout).click();}
    public void backToShopping(){driver.findElement(backToShopping).click();}

}
