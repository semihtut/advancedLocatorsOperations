package Procounter;


import Utilities.BrowserUtils;
import Utilities.Driver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class Testtesing {

    @Test
    public void test1() throws InterruptedException {
        Driver.get().get("https://secure.procountor.com/procountor/#!NAV_FRONT_PAGE");
        Driver.get().manage().window().maximize();
        WebElement activeElement = Driver.get()
                .switchTo().
                        activeElement();
        activeElement
                .sendKeys("tutustuja123",
                        Keys.TAB,"Tutustuja",Keys.ENTER);
        Thread.sleep(3000);
        Driver.get().findElement(By.cssSelector("#GuiButton_OK")).click();
        Thread.sleep(2000);
        Driver.get().findElement(By.cssSelector("#SearchParameterTextField"))
                .sendKeys("import data");
        Thread.sleep(1000);
        WebElement element = Driver.get().findElement(By.className("match"));
        BrowserUtils.waitForVisibility(element,5);
        BrowserUtils.clickWithJS(element);
        Thread.sleep(2000);

        WebElement element4 = Driver.get().findElement(By.xpath("//input[starts-with(@id,'gwt-uid')]"));
        element4.sendKeys("Import invoices");
        Thread.sleep(100);
        element4.sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        WebElement element1 = Driver.get().findElement(By.xpath("//span[contains(text(),'Select file')]"));
        BrowserUtils.clickWithJS(element1);
        Thread.sleep(2000);
        WebElement element2 = Driver.get().findElement(By.cssSelector(".gwt-FileUpload"));
        BrowserUtils.clickWithJS(element2);
       /* Driver.get().switchTo().activeElement().sendKeys(Keys.TAB,Keys.TAB);
        Thread.sleep(1000);
        Driver.get().switchTo().activeElement().sendKeys(Keys.ARROW_UP, Keys.ARROW_UP   );
        Thread.sleep(1000);*/
        Thread.sleep(1000);




        String path = "C:\\Users\\yalaa\\AdvancedLocators\\en_csv_invoice (1).csv";
        BrowserUtils.uploadFileByRobot(path);
        Thread.sleep(2000);



        WebElement guiButton_continue = Driver.get().findElement(By.id("GuiButton_CONTINUE"));
        guiButton_continue.click();
        Thread.sleep(2000);

        WebElement guiLabel_ch_filename = Driver.get().findElement(By.id("GuiLabel_CH_FILENAME"));
        String getAttr = guiLabel_ch_filename.getAttribute("innerText");
        System.out.println("getAttr = " + getAttr);


        WebElement continued = Driver.get().findElement(By.xpath("//span[contains(text(),'Continue')]"));
        BrowserUtils.clickWithJS(continued);
        Thread.sleep(5000);
        Driver.get().quit();

    }
}
