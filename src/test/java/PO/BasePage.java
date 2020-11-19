package PO;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    protected WebElement searchBar;

    @FindBy(xpath = "(//div[@class='sg-row']//h2)[1]")
    protected WebElement searchedFirstItem;

    @FindBy(xpath = "((//div[@class='sg-row']//h2)[1]/parent::div/following-sibling::div//a//i)[1]")
    protected WebElement howmanyStars;

    @FindBy(css = ".a-price-whole")
    protected List<WebElement> wholePrices;

    @FindBy(css = ".a-price-fraction")
    protected List<WebElement> wholePricesFraction;

    public String price(int itemNumber){
        String price = BrowserUtils.getElementsText(wholePrices).get(itemNumber);
        String decimal = BrowserUtils.getElementsText(wholePricesFraction).get(itemNumber);
        return price+"."+decimal;
    }
}

