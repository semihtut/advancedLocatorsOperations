package DeisgnPatternsForHighQualityTestAutomation.DecoratorPattern2;




import org.testng.Assert;

import java.util.function.Consumer;

public class ManageConsoleTestDecorators {

        //base validation
        public static Consumer<ManageConsolePage> orderValidation = (page) -> {
            Assert.assertTrue(page.getOrderManagement().isDisplayed());

            page.getOrderManagement().createNewOrder();
            Assert.assertTrue(page.getOrderManagement().isOrderSucccessful());
        };

        //user component presence check
        public static Consumer<ManageConsolePage> userValidation = (page) -> {
            Assert.assertTrue(page.getUserManagement().isDisplayed());
        };

        //user component absence check
        public static Consumer<ManageConsolePage> userAbsenceValidation = (page) -> {
            Assert.assertFalse(page.getUserManagement().isDisplayed());
        };

        //report component presence check
        public static Consumer<ManageConsolePage> reportValidation = (page) -> {
            Assert.assertTrue(page.getReport().isDisplayed());
        };

        //report component absence check
        public static Consumer<ManageConsolePage> reportAbsenceValidation = (page) -> {
            Assert.assertFalse(page.getReport().isDisplayed());
        };

        //bu component presence check
        public static Consumer<ManageConsolePage> buValidation = (page) -> {
            Assert.assertTrue(page.getBuManagement().isDisplayed());
        };

        //bu component absence check
        public static Consumer<ManageConsolePage> buAbsenceValidation = (page) -> {
            Assert.assertFalse(page.getBuManagement().isDisplayed());
        };

    }

