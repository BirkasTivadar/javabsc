package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client client = new Client();

        System.out.println("Kérem a nevét: ");
        client.setName(scanner.nextLine());

        System.out.println("Kérem a születési évét: ");
        client.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Kérem a címét: ");
        client.setAddress(scanner.nextLine());

        System.out.println("Az ügyfél neve: " + client.getName() +
                ", a születési éve: " + client.getYear() +
                ", a címe: " + client.getAddress());

        System.out.println("\nKérem az új címet: ");
        client.migrate(scanner.nextLine());

        System.out.println("Az ügyfél új címe: " + client.getAddress());

    }
}
