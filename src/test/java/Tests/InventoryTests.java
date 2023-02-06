package Tests;

import Pages.InventoryPage;
import Pages.LogInPage;
import org.bouncycastle.dvcs.DVCSRequestInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static org.openqa.selenium.WindowType.TAB;

public class InventoryTests  extends BaseTest{

    InventoryPage inventoryPage=new InventoryPage(driver);
    LogInPage logInPage = new LogInPage(driver);

    @Before
    public void setUp() throws Exception {
        driver.get("https://saucedemo.com");
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();

    }

    //Add items to cart test

    @Test
    public void addBackpacktoCart() {
        inventoryPage.clickAddCartSauceLabsBackpackButton();
        Assert.assertTrue(driver.findElement(inventoryPage.removeBackpackFromCartButton).isDisplayed());

    }

    @Test
    public void addOneSieToCart() {
        inventoryPage.clickAddCartOnesieButton();
        Assert.assertTrue(driver.findElement(inventoryPage.removeOnesieFromCartButton).isDisplayed());


    }

    @Test
    public void addShirtRedToCart() {
        inventoryPage.clickAddToCartShirtRedButton();
        Assert.assertTrue(driver.findElement(inventoryPage.removeShirtRedFromCartButton).isDisplayed());

    }

    //Testing Twitter, Facebook and LinkedIn links

    @Test
    public void twitter() {
        inventoryPage.clickTwitterButton();
        String oldTab =driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        Assert.assertEquals("https://twitter.com/saucelabs", driver.getCurrentUrl());
    }


    @Test
    public void clickFacebookIcon() {
        inventoryPage.clickFacebookButton();
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        Assert.assertEquals("https://www.facebook.com/saucelabs", driver.getCurrentUrl());

    }

    @Test
    public void clickLinkedInIcon() {
        inventoryPage.clickLinkedInButton();
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        if (driver.getCurrentUrl().contains("linkedin.com")) {
            System.out.println("The click on the LinkedIn button was successful and opened the correct link.");
        } else {
            System.out.println("The click on the LinkedIn button did not open the correct link.");
        }

        }
}
