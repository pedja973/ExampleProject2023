package Tests;

import Pages.LogInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.google.common.net.InternetDomainName.isValid;
import static org.junit.Assert.assertTrue;

public class LogInTests extends BaseTest{

    LogInPage logInPage = new LogInPage(driver);

    @Before
    public void setUp() throws Exception {
        driver.get("https://saucedemo.com");
    }

    // Zadatak 1. LogIn function test

    @Test
    public void testLogInWithValidUserNamePassword() {

        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());

    }

    @Test
    public void testLogInWithValidUserNameInvalidPassword() {

        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("DDD");
        logInPage.clickOnLogInButton();
        String actualUrl="https://www.saucedemo.com/";
        String expectedUrl = driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Incorrect Login Details");
        } else
            System.out.println("Login Success");
        }

    @Test
    public void testLogInWithInvalidUserValidPassword() {
        logInPage.enterUserName("pedka");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLogInButton();
        String actualUrl="https://www.saucedemo.com/";
        String expectedUrl = driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Incorrect Login Details");
        } else
            System.out.println("Login Success");
    }

    @Test
    public void testNoUserNoPassword() {
        logInPage.enterUserName("");
        logInPage.enterPassword("");
        logInPage.clickOnLogInButton();
        String actualUrl="https://www.saucedemo.com/";
        String expectedUrl = driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Incorrect Login Details");
        } else
            System.out.println("Login Success");
    }

    @Test
    public void testWithValidUserNoPass() {
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("");
        logInPage.clickOnLogInButton();
        String actualUrl="https://www.saucedemo.com/";
        String expectedUrl = driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Incorrect Login Details");
        } else
            System.out.println("Login Success");

    }
}
