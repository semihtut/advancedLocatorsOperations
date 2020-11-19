package Advanced_Locators_Exercises;

import PO.BasePage;
import Utilities.BrowserUtils;
import Utilities.Driver;
import Utilities.StringNameGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class xpath extends BasePage {

    Map<String,String>bookPrice = new HashMap<>();
    @Test
    public void test(){
        Driver.get().manage().window().maximize();
        Driver.get().get("https://www.amazon.com/");
        String bookName = StringNameGenerator.bookName();
        BrowserUtils.waitForClickablility(searchBar,5);
        try {
            searchBar.sendKeys(bookName);
            searchBar.sendKeys(Keys.TAB,Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bookPrice.put(bookName,price(1));
        System.out.println("bookPrice = " + bookPrice);


        Driver.get().quit();
    }



}
