package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORY PATTERN");
        System.out.println("===============");

        WebShopPage webshopPage = new WebShopPage();
        webshopPage.searchBar().search("Berlin");
    }

}
