package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FirstTraditionalWay;

public class Mian {
    public static void main(String[] args) {
        System.out.println("PAGE OBJECTS");
        System.out.println("============");

        WebShopPage webshopPage = new WebShopPage();
        webshopPage.search("T-Shirt");
        webshopPage.checkResultHeadline();
        webshopPage.checkResults();
    }
}
