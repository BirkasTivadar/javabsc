package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a számot:");
        int number = scanner.nextInt();

        System.out.println("A szám osztható hárommal: " + (number % 3 == 0));
    }
}
