package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FactoryPattern;

public class WebShopPage extends ComponentFactory{


    public SearchBar searchBar() throws Exception {
        return (SearchBar) ComponentFactory.getComponent("SearchBar");
       // return new SearchBar();
    }

    public ResultList resultList() throws Exception {

        return (ResultList) ComponentFactory.getComponent("ResultList");

    }
}

