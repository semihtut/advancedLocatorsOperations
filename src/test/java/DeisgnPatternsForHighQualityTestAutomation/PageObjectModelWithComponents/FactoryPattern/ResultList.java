package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FactoryPattern;

public class ResultList extends Component {

    public void checkResultHeadline() {

        System.out.println("Check if the headline is correct.");
    }

    public void checkResults() {

        System.out.println("Check if there are search results.");
    }

    @Override
    public void initialize() {
        super.initialize();
    }
}
