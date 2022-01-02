package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Client client = new Client();

        System.out.println(("Kérem a nevét: "));
        client.name = scanner.nextLine();
        System.out.println(("Kérem a születési évét: "));
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println(("Kérem a címét: "));
        client.address = scanner.nextLine();

        System.out.println("A neve: " + client.name +
                ", a születési éve: " + client.year +
                ", a címe: " + client.address);
    }
}
