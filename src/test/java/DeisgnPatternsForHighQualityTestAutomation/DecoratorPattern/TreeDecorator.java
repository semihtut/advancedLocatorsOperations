package DeisgnPatternsForHighQualityTestAutomation.DecoratorPattern;

public abstract class TreeDecorator implements ChristmasTree{
    private ChristmasTree tree;


    @Override
    public String decorate() {
        return tree.decorate();
    }

}
