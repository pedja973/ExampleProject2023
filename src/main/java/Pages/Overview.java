package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Overview {

    public WebDriver driver;

    public By finishButton = By.id("finish");

    public Overview(WebDriver driver){this.driver = driver;}

    public void finish () {driver.findElement(finishButton).click();}


}
