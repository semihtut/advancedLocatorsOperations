package lambda.suppliers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Supplier<WebDriver>chromeSupplier = ()-> {
        System.setProperty("webdriver.chrome.driver","chrome driver path");
        return new ChromeDriver();
    };

    private static final Supplier<WebDriver>firefoxSupplier = ()-> {
        System.setProperty("webdriver.gecko.driver","firefox driver path");
        return new FirefoxDriver();
    };

    private static final Map<String,Supplier<WebDriver>>MAP=new HashMap<>();

    static {
        MAP.put("chrome",chromeSupplier);
        MAP.put("firefox",firefoxSupplier);
    }

    public static WebDriver getMyDriver(String browser){
        // the second get is from suppliers inbuilt
        return MAP.get(browser).get();
    }
}
