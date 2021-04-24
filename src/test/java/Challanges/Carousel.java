package Challanges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Carousel {
    @Test
    public void handleWithCarousel() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement title = driver.findElement
                (By.xpath("//span[@class='a-color-base']" +
                        "[normalize-space()='Discover Amazon']"));

        //(//span[@class='a-color-base'][normalize-space()='Discover Amazon']/parent::h2/parent::div/following-sibling::div//span[@class='gw-icon feed-arrow'])[2]
        WebElement rightArrow = driver.findElement(
                By.xpath("(//span[@class='a-color-base']" +
                        "[normalize-space()='Discover Amazon']" +
                        "/parent::h2/parent::div/following-sibling::" +
                        "div//span[@class='gw-icon feed-arrow'])[2]"));

        while (true) {
            rightArrow.click();
            rightArrow.click();rightArrow.click();
            rightArrow.click();
            rightArrow.click();


        }
    }
}
