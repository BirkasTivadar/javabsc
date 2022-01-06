package stringtype.registration;

public class UserValidator {


    public boolean isValidUsername(String username) {
        return !isEmpty(username);
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int atIndex = email.indexOf("@");
        int dotAfterAtIndex = email.indexOf(".", atIndex);
        int lastCharIndex = email.length() - 1;
        return atIndex > 1
                &&
                (dotAfterAtIndex - atIndex) > 1
                &&
                dotAfterAtIndex < lastCharIndex;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }
}
