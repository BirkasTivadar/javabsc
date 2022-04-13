package introexceptionthrow;

/*
Gyakorlati feladat - Pozitív szám
        A PositiveNumber osztályban kérj be a felhasználótól egy pozitív számot, és dobj IllegalArgumentException kivételt, ha nem jó adatot ad meg (pl. szöveget)! Adj a kivételnek egy kellően informatív tájékoztató üzenetet!
*/


import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy pozitív számot: ");
        String positiveNumber = scanner.nextLine();

        char[] chars = positiveNumber.toCharArray();

        for (char c : chars) {
            if (!(Character.isDigit(c) || c == '.')) {
                throw new IllegalArgumentException("Nem pozitív szám");
            }
        }
        System.out.println(positiveNumber);
    }

}

