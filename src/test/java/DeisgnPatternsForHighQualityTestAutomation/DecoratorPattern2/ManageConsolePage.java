package DeisgnPatternsForHighQualityTestAutomation.DecoratorPattern2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageConsolePage {

    @FindBy(id = "bumgmt")
    private BUManagement buManagement;

    @FindBy(id = "ordermgmt")
    private OrderManagement orderManagement;

    @FindBy(id = "usermgmt")
    private UsersManagement usersManagement;

    @FindBy(id = "reports")
    private Reports reports;

    public BUManagement getBuManagement() {
        return buManagement;
    }

    public OrderManagement getOrderManagement() {
        return orderManagement;
    }

    public UsersManagement getUsersManagement() {
        return usersManagement;
    }

    public Reports getReports() {
        return reports;
    }

    public WebElement getReport() {
        return null;
    }

    public WebElement getUserManagement() {
        return null;
    }
}

