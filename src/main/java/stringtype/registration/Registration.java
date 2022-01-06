package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();

        System.out.println("Kérem a nevet:");
        String name = scanner.nextLine();

        System.out.println("Kérem a jelszót:");
        String password1 = scanner.nextLine();
        System.out.println("Kérem a jelszót újra:");
        String password2 = scanner.nextLine();

        System.out.println("Kérem az email címet:");
        String email = scanner.nextLine();

        System.out.println("A(z) " + name + (userValidator.isValidUsername(name) ? " helyes" : " helytelen"));
        System.out.println("A(z) " + password1 + (userValidator.isValidPassword(password1, password2) ? " helyes" : " helytelen"));
        System.out.println("A(z) " + email + (userValidator.isValidEmail(email) ? " helyes" : " helytelen"));
    }
}
