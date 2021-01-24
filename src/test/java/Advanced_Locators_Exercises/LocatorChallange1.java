package Advanced_Locators_Exercises;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorChallange1 {

    @Test
    public void Test1() {
        Driver.get().get("https://books-pwakit.appspot.com/");

        WebElement searchBox = Driver.get().findElement(By.tagName("book-app"));
        WebElement shadow = BrowserUtils.shadow(searchBox);
        shadow.findElement(By.tagName("app-header"))
                .findElement(By.className("toolbar-bottom"))
                .findElement(By.tagName("book-input-decorator"));

        shadow.findElement(By.id("input")).sendKeys("semihhhhhhhhhhhhhhhhhhhhhhhhhh");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Driver.get().quit();
    }

    @Test
    public void Test2() {
        Driver.get().get("https://www.flipkart.com/");
        Driver.get().manage().window().maximize();
        Driver.get().switchTo().activeElement().sendKeys(Keys.ESCAPE);
        Driver.get().switchTo().defaultContent();
        try {
            WebElement img = Driver.get().findElement(By.xpath("//img[@alt='Electronics']"));
            BrowserUtils.hover(img);
            WebElement mobileAcc = Driver.get().findElement(By.xpath("//a[normalize-space()='MobileAccessory']"));
            BrowserUtils.hover(mobileAcc);
            WebElement designer = Driver.get().findElement(By.xpath("//a[normalize-space()='Designer Cases']"));
            BrowserUtils.hover(designer);
        } catch (Exception e) {
            WebElement img = Driver.get().findElement(By.xpath("//span[contains(text(),'Electronics')]"));
            BrowserUtils.hover(img);
            WebElement mobileAcc = Driver.get().findElement(By.xpath("//a[@title='MobileAccessory']"));
            BrowserUtils.hover(mobileAcc);
        }


    }

    @Test
    public void Test3() {
        Driver.get().get("https://www.amazon.in/s?i=electronics&bbn=1805560031&rh" +
                "=n%3A976419031%2Cn%3A%21976420031%2Cn%3A1389401031%2Cn%3A1389432031%2Cn%3A1805560031%2Cp" +
                "_6%3AA14CZOWI0VEHLG%7CA1P3OPO356Q9ZB%7CA2HIN95H5BP4BL%2Cp_89%3AApple&ref=mega_elec_s23_1_2_1_6");
        Driver.get().manage().window().maximize();
        List<WebElement> blackIP = Driver.get().findElements(By.xpath("//div[h2[a[span[contains(text(),' Black')]]]]" +
                "/following-sibling::div[2]//span[@class='a-price-whole']"));

        for (WebElement i : blackIP) {
            System.out.println("prices " + i.getText());
        }
        /*List<WebElement> h2 = Driver.get().findElements(By.tagName("h2"));
        List<WebElement> prices = Driver.get().findElements(By.className("a-price-whole"));
        
        int size = prices.size();
        for(int i=0;i<=size;i++){
            if(h2.get(i).getText().contains("Black")){
                System.out.println(prices.get(i).getText());
            }
        }*/

         /*List<WebElement> h2 = Driver.get().findElements(By.tagName("h2"));
        List<WebElement> prices = Driver.get().findElements(By.className("a-price-whole"));

        int size = prices.size();
        for(int i=0;i<=size;i++){
            if(h2.get(i).getText().contains("Black")){
                System.out.println(prices.get(i).getText());
            }
        }*/

        // a~b   b siblings of a
        /*
       ----------- Type Selector -----------
        Select elements by their type
        A
        Selects all elements of type A. Type refers to the type of tag, so div, p and ul are all different element types.
        Examples:
            div selects all div elements.
            p selects all p elements.

        ----------- ID Selector --------------
        Select elements with an ID
        #id
        Selects the element with a specific id. You can also combine the ID selector with the type selector.
        Examples:
            #cool selects any element with id="cool"
            ul#long selects <ul id="long">

        ------------ Descendant Selector --------------
        Select an element inside another element
        A  B
        Selects all B inside of A. B is called a descendant because it is inside of another element.
        Examples
            p  strong selects all <strong> elements that are inside of any <p>
            #fancy  span selects any <span> elements that are inside of the element with id="fancy"









         */



    }
}
