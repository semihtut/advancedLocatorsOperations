package DeisgnPatternsForHighQualityTestAutomation.DecoratorPatternMinistryOfTesting;

public abstract class LoginDecorator implements LoginComponent{

    private final LoginComponent loginComponent;

    protected LoginDecorator(LoginComponent loginComponent) {
        this.loginComponent = loginComponent;
    }

    @Override
    public void login(String username, String password) {
        loginComponent.login(username,password);
    }
}
