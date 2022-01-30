package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public LocalDate getFullDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public String getFullName(String lastName, String firstName) {
        return lastName + " " + firstName;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a vezetéknevét:");
        String lastName = scanner.nextLine();
        System.out.println("Kérem a keresztnevét:");
        String firstName = scanner.nextLine();

        System.out.println("Kérem a születési évét:");
        int birthOfYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a születési hónapot:");
        int birthOfMonth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a születési napot:");
        int birthOfDay = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem az email címét:");
        String email = scanner.nextLine();

        Registration registration = new Registration();
        Person person = new Person(registration.getFullName(lastName, firstName), registration.getFullDateOfBirth(birthOfYear, birthOfMonth, birthOfDay), email);

        System.out.println(person);
    }
}
