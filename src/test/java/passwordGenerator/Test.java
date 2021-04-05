package passwordGenerator;

public class Test {
    public static void main(String[] args) {

        PasswordValidator validator = PasswordValidator.login();
        validator.printPasswordRules();
        do{
            String proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }

        }while(!validator.isValid());

        System.out.println("The proposed password is valid");

        validator.closeScanner();

    }
}
