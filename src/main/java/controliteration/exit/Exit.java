package controliteration.exit;

//Gyakorlati feladat - Kilépés
//        Az exit.Exit osztály main() metódusában írd meg a következőket:
//        Az alkalmazás elindításakor jelenjen meg a konzolon az a szöveg, hogy “Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával”
//        És innentől kezdve az alkalmazás mindaddig ezt írja ki, ameddig a felhasználó nem nyomja meg az “x” billentyűt a billentyűzeten!
//        Használd a do-while ciklust!

import java.util.Scanner;

public class Exit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
            str = scanner.nextLine();
        } while (!str.trim().equalsIgnoreCase("x"));
    }
}
