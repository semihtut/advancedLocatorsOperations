package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FactoryPattern;

public class SearchBar extends Component{

    public void search(final String queryString) {
        System.out.println("Enter " + queryString);
        System.out.println("Click search button");

    }

    @Override
    public void initialize() {
        super.initialize();
    }
}
