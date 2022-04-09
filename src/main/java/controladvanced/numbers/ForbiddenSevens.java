package controladvanced.numbers;

import java.util.Scanner;

//Gyakorlati feladat - Tiltott 7-esek
//        A numbers.ForbiddenSevens osztály main() metódusában implementáld, hogy a felhasználó által megadott pozitív egész számtól kezdve a program kiírja a konzolra az összes számot, de a 7-tel osztható számok helyett X-et írjon ki, viszont 7-tel nem osztható, de 7-es számjegyet tartalmazó szám elérése esetén pedig álljon le a program! Tehát pl. ha a felhasználó 3-at ad meg, akkor a következők kerüljenek a konzolra (sortöréssel egymás alá):
//        3 4 5 6 X 8 9 10 11 12 13 X 15 16

public class ForbiddenSevens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a számot:");
        int number = scanner.nextInt();

        for (int i = number; ; i++) {
            String seven = "7";
            String str = "" + i;
            if (i % 7 == 0) {
                System.out.println("X");
            } else if (str.contains(seven)) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
