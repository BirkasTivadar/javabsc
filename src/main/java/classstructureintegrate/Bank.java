package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A tulajdonos neve?");
        String name = scanner.nextLine();

        System.out.println("A tulajdonos számlaszáma?");
        String accountNumber = scanner.nextLine();

        System.out.println("a nyitó összeg?");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount = new BankAccount(accountNumber, name, balance);

        System.out.println(bankAccount.getInfo());

        System.out.println("\nMekkora összeget kíván betenni?");
        bankAccount.deposit(scanner.nextInt());
        scanner.nextLine();

        System.out.println(bankAccount.getInfo());

        System.out.println("\nMekkora összeget kíván kivenni?");
        bankAccount.withdraw(scanner.nextInt());
        scanner.nextLine();

        System.out.println(bankAccount.getInfo());
    }
}
