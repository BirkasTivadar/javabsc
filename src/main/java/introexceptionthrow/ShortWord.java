package introexceptionthrow;

/*
Gyakorlati feladat - Rövid szó
        A ShortWord osztályban kérj be a felhasználótól egy legfeljebb 5 betűs szót! Dobj IllegalArgumentExceptionkivételt a megfelelő tájékoztató üzenettel, ha ennél hosszabb szót ad meg! Akkor is dobj kivételt (egy másik üzenettel), ha ugyan jó a megadott adat hossza, de betűn kívül más karaktereket is tartalmaz! Végül, ha helyes az adat, írd is ki a konzolra a felhasználó által megadott szót!
*/

import java.util.Scanner;

public class ShortWord {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy maximum 5 bets szót: ");
        String maxFiveLetter = scanner.nextLine();

        char[] chars = maxFiveLetter.toCharArray();

        if (chars.length > 5) {
            throw new IllegalArgumentException("Túl hosszú szó");
        }

        for (char c : chars) {
            if (!(Character.isAlphabetic(c))) {
                throw new IllegalArgumentException("Nem csak betűt tartalmaz");
            }
        }
        System.out.println(maxFiveLetter);
    }
}


