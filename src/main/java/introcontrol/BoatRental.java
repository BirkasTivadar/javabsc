package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a létszámot:");
        int numberOfPeople = scanner.nextInt();
        int numberInBoats = 10;

        if (numberOfPeople >= 5) {
            System.out.println("Kiment az ötfős csónak.");
            numberOfPeople -= 5;
            numberInBoats -= 5;
        }

        if (numberOfPeople >= 3) {
            System.out.println("Kiment a háromfős csónak.");
            numberOfPeople -= 3;
            numberInBoats -= 3;
        }

        if (numberOfPeople > 0) {
            System.out.println("Kiment a kétfős csónak.");
            numberOfPeople -= 2;
            numberInBoats -= 2;
        }

        if (numberInBoats > 0) {
            System.out.println("Még " + numberInBoats + " fő mehet utánuk.");
        }

        if (numberOfPeople > 0) {
            System.out.println("A parton maradt: " + numberOfPeople + " ember.");
        }

    }
}
