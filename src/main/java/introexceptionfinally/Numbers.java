package introexceptionfinally;

/*
Gyakorlati feladat - Páros szám
        A Numbers osztályban addig írd ki a felhasználónak, hogy adjon meg egy számot, amíg egyszer páros számot nem ad meg! Páros szám beérkezésekor érjen véget a program futása! Ha esetleg nem számot adna meg (hanem pl. betűt), akkor a keletkező NumberFormatException-t kezeld le és dobj helyette egy IllegalArgumentException-t egy megfelelő tájékoztató szöveggel! Írj finally ágat is, és abban írd ki minden kör után, hogy “End of round.”
*/

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;

        while (number % 2 != 0) {
            System.out.println("Kérek egy számot:");
            String numberString = scanner.nextLine();
            try {
                number = Integer.parseInt(numberString);
                System.out.println(number);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("This is not number: " + numberString, nfe);
            } finally {
                System.out.println("End of round.");
            }
        }
    }
}
