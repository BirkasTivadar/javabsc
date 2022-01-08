package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Kérem a(z) " + (i + 1) + ". számot:");
            sum += scanner.nextInt();
        }

        System.out.println("Az öt szám összege: " + sum);
    }
}
