package passwordGenerator;

public class Test2 {
    public static void main(String[] args) {

        PasswordValidator2 passwordValidator = new PasswordValidator2("Semitut94.");
        passwordValidator.checkPassword(passwordValidator.getCurrentPassword());
        passwordValidator.checkPasswordIsValid();

    }
}
