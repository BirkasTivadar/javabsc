package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot:");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem az második számot:");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;

        System.out.println(firstNumber + " + " + secondNumber);
        System.out.println(result);

    }
}
