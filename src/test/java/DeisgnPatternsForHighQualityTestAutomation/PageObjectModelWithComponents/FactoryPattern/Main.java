package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FactoryPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("FACTORY PATTERN");
        System.out.println("===============");

        WebShopPage webshopPage = new WebShopPage();
        webshopPage.searchBar().search("Berlin");
    }

}
