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

        /**
         *
         *  TO CHECK MAIL
         *      ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$
         *
         *      ^            # start-of-string
         * (?=.*[0-9])       # a digit must occur at least once
         * (?=.*[a-z])       # a lower case letter must occur at least once
         * (?=.*[A-Z])       # an upper case letter must occur at least once
         * (?=.*[@#$%^&+=])  # a special character must occur at least once
         * (?=\S+$)          # no whitespace allowed in the entire string
         * .{8,}             # anything, at least eight places though
         * $                 # end-of-string
         *
         */

    }

    public class passwordvalidation {
        public void main(String[] args) {
            String passwd = "aaZZa44@";
            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
            System.out.println(passwd.matches(pattern));

        }
    }
}
