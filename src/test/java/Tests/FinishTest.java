package Tests;

import Pages.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;

public class FinishTest extends BaseTest {

    Finish finish=new Finish(driver);
    LogInPage logInPage=new LogInPage(driver);
    InventoryPage inventoryPage=new InventoryPage(driver);
    CheckoutPage checkoutPage=new CheckoutPage(driver);
    CartPage cartPage=new CartPage(driver);
    Overview overview=new Overview(driver);


    //Zadatak 2. Testing of successful purchase

    @Test
    public void successfulBuy() {

        driver.get("https://www.saucedemo.com/");
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        inventoryPage.clickAddToCartShirtRedButton();
        inventoryPage.clickAddCartOnesieButton();
        inventoryPage.clickAddCartSauceLabsBackpackButton();
        inventoryPage.clickCartButton();
        cartPage.continueToCheckout();
        checkoutPage.enterFirstName("Predrag");
        checkoutPage.enterLastName("Knezevic");
        checkoutPage.enterZipCode("11000");
        checkoutPage.proceed();
        overview.finish();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", finish.getNotification());

    }
}
