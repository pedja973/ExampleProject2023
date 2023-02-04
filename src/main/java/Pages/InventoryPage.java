package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    public WebDriver driver;

    public By addBackpackToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    public By removeBackpackFromCartButton = By.id("remove-sauce-labs-backpack");
    public By addOnesieToCartButton = By.id("add-to-cart-sauce-labs-onesie");
    public By removeOnesieFromCartButton = By.id("remove-sauce-labs-onesie");
    public By addShirtRedToCartButton = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    public By removeShirtRedFromCartButton = By.id("remove-test.allthethings()-t-shirt-(red)");
    public By cartButton = By.id("shopping_cart_container");

    public By sortContainer = By.xpath("//select[@class='product_sort_container']");
    public By cartButtonWithQuantity = By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");

    public By leftMenuButton = By.id("react-burger-menu-btn");
    public By sauceLabsBackpack = By.xpath("//div[text()='Sauce Labs Backpack']");
    public By sauceLabsOnesie = By.xpath("//div[text()='Sauce Labs Onesie']");
    public By ShirtRed = By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']");
    public By twitterButton = By.linkText("Twitter");
    public By facebookButton = By.linkText("Facebook");
    public By linkedInButton = By.linkText("LinkedIn");
    public InventoryPage(WebDriver driver){this.driver = driver;}

    public void clickSauceLabsBackpack() {driver.findElement(sauceLabsBackpack).click();}
    public void clickAddCartSauceLabsBackpackButton() {driver.findElement(addBackpackToCartButton).click();}

    public void clickSauceLabsOnesie() {driver.findElement(sauceLabsOnesie).click();}
    public void clickAddCartOnesieButton() {driver.findElement(addOnesieToCartButton).click();}

    public void clickShirtRed() {driver.findElement(ShirtRed).click();}
    public void clickAddToCartShirtRedButton() {driver.findElement(addShirtRedToCartButton).click();}
    public void clickCartButton(){driver.findElement(cartButton).click();}
    public void clickTwitterButton(){driver.findElement(twitterButton).click();}
    public void clickFacebookButton(){driver.findElement(facebookButton).click();}
    public void clickLinkedInButton(){driver.findElement(linkedInButton).click();}












}
