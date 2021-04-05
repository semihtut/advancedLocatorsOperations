package passwordGenerator;


public class PasswordValidator2 {

    private final String username="semih";
    private String currentPassword;

    private boolean valid;
    private String errorMessage;


    public PasswordValidator2(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void changePassword(String newPassword){

        valid = true;
        errorMessage = "";

        if(newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters.";
        }

        //Alternatively, can loop through string and use Character.isUpperCase on each char
        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
        }

        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
        }

        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username.";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from your current password.";
        }
        setCurrentPassword(newPassword);

    }

    public void checkPasswordIsValid() {
        if(!isValid()){
            System.out.println(getErrorMessage());
        }else{
            System.out.println("The proposed password is valid");
        }
    }
}
