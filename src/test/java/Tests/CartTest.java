package Tests;

import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LogInPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CartTest extends BaseTest {

    CartPage cart = new CartPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);
    LogInPage logInPage = new LogInPage(driver);

    @Before
    public void setUp() throws Exception {
        driver.get("https://saucedemo.com");
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        inventoryPage.clickAddCartSauceLabsBackpackButton();
        inventoryPage.clickCartButton();
    }

    @Test
    public void removeBackpackFromCart() {
        cart.removeBackPack();

        //does not work

        Assert.assertFalse(driver.findElement(cart.sauceLabsBackpack).isDisplayed());

        boolean isBackpackInCart = driver.findElement(cart.sauceLabsBackpack).isDisplayed();
        assert !isBackpackInCart : "The item was not removed from the cart";



    }
}
