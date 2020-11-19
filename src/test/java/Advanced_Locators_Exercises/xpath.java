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

    public static int test2(int num1,int num2){
        return num1>num2?num1+num2:num1*num2;

    }
    public static int test3(int num1,int num2){
        int toplam = 0;
        for(int i = num1;i<num2;i++){
            toplam=i%2!=0?toplam+i:toplam;
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println(test2(9,10));
        System.out.println(test3(0, 10));
    }
}
