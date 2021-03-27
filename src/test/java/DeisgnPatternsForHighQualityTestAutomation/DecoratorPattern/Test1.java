package DeisgnPatternsForHighQualityTestAutomation.DecoratorPattern;

import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void decorator(){

        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImp());
        tree1.decorate();

    }
}
