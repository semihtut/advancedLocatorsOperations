package PO;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestFlipCard {

    @Test
    public void loginPopUp() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
       // BrowserUtils.waitForVisibility(Driver.get().findElement(By.className("_1_3w1N")),5);
       // Driver.get().findElement(By.className("_1_3w1N")).click();
        Thread.sleep(2000);
        Driver.get().switchTo().activeElement().sendKeys(Keys.ESCAPE);
        Thread.sleep(2000);
        Driver.closeDriver();


    }
}
