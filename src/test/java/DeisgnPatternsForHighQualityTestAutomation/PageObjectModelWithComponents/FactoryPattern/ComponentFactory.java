package DeisgnPatternsForHighQualityTestAutomation.PageObjectModelWithComponents.FactoryPattern;

public class ComponentFactory {
    public static Component getComponent(final String componentName) throws Exception {

        System.out.println("Creating " + componentName + "...");

        // Create a component instance for the passed in component name.
        Component component;
        switch (componentName){
            case "SearchBar":
                component = new SearchBar();
                break;
            case "ResultList":
                component = new ResultList();
                break;
            default:
                throw new Exception(componentName + " unknown.");
        }
        System.out.println("Component created: " + component);
        component.initialize();
        return component;
    }
}
