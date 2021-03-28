package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FactoryPattern;

public class WebShopPage extends ComponentFactory{


    public SearchBar searchBar() {
        return new SearchBar();
    }

    public ResultList resultList() {

        return new ResultList();
    }
}

