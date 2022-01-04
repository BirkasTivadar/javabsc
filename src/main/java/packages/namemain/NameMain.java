package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

import java.util.Scanner;

public class NameMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a prefixet:");
        Prefix prefix = new Prefix(scanner.nextLine());

        System.out.println("Kérem a keresztnevet:");
        FirstName firstName = new FirstName(scanner.nextLine());

        System.out.println("Kérem a családi nevet:");
        LastName lastName = new LastName((scanner.nextLine()));

        System.out.println("\nA teljes név:");
        System.out.println(prefix.getPre() + " " + firstName.getFirst() + " " + lastName.getLast());

    }
}
