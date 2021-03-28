package DeisgnPatternsForHighQualityTestAutomation.DecoratorPatternMinistryOfTesting;

public class CancelButtonDecorator extends LoginDecorator{
    protected CancelButtonDecorator(LoginComponent loginComponent) {
        super(loginComponent);
    }
    public void cancel() {
        System.out.println("Click the cancel button");
    }
}
