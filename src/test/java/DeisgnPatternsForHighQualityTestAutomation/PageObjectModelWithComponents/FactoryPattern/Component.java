package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FactoryPattern;

public class Component {
    public void initialize() {
        System.out.println("Initializing " + getClass().getName());
    }
}
