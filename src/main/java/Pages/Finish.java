package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Finish {

    public WebDriver driver;

    public Finish(WebDriver driver){this.driver = driver;}

    public By Notification = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

    public String getNotification() {
        return driver.findElement(Notification).getText();
    }
}
