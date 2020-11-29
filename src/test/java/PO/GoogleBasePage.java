package PO;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleBasePage {

    public GoogleBasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[@class='gb_g'][contains(@href,'mail')]")
    public WebElement gmail;

    @FindBy(xpath = "//a[@class='gb_g'][contains(@href,'img')]")
    public WebElement images;

    @FindBy(xpath = "a[title='Google apps']")
    public WebElement aps;

    @FindBy(className = "gb_Ha gbii")
    public WebElement profile;

    @FindBy(name = "q")
    public WebElement searchBar;

    @FindBy(xpath = "(//h3[@class='LC20lb DKV0Md'][1])[1]")
    public WebElement firstItem;
}
