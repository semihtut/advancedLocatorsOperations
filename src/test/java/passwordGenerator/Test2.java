package passwordGenerator;

public class Test2 {
    public static void main(String[] args) {

        PasswordValidator2 passwordValidator = new PasswordValidator2("Semitut94.");
        passwordValidator.changePassword("setu.setU");
        passwordValidator.checkPasswordIsValid();

    }
}
