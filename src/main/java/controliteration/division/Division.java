package controliteration.division;


//Gyakorlati feladat - Oszthatóság
//        Írj a division.Division osztályban kérj be a felhasználótól két számot a következő módon:
//        “Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.”
//        “Hánnyal osztható számokat szeretne kapni?”
//        Majd írd ki a konzolra ezeknek a feltételeknek megfelelő pozitív egész számokat! (Tehát ha pl. a felhasználó 35-ig szeretné látni a 3-mal osztható számokat, akkor a következő szerepeljen a konzolon: 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33,)
//        Oldd meg a feladatot for és while ciklus használatával is!

import java.util.Scanner;

public class Division {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int div = scanner.nextInt();
        scanner.nextLine();

        int numFor = num;

        System.out.println("While ciklussal:");
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(num);
            }
            num--;
        }

        System.out.println();
        System.out.println("For ciklussal:");
        for (int i = numFor; i > 1; i--) {
            if (i % div == 0) {
                System.out.println(i);
            }
        }

    }
}
