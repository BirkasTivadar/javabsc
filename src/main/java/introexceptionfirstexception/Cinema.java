package introexceptionfirstexception;

//Gyakorlati feladat - Mozijegyek
//        A Cinema osztály main() metódusában implementálj egy interneten keresztüli mozijegy vásárlást! Kérd be a vásárló nevét, hogy melyik filmre szeretne jegyet venni, hogy hány jegyet kér és melyik sorba kéri azokat! Majd írd ki a konzolra a vásárlás adatait! Figyelj arra, hogy a jegyek egymás mellé szóljanak!
//        Ilyesmi kiírást valósíts meg:
//        A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:
//        Vásárló neve: Minta Béla
//        Film címe: Titanic
//        Lefoglalt helyek: 2. sor 1. szék, 2. sor 2. szék, 2. sor 3. szék
//        Jó szórakozást!
//        Próbáld ki, hogyan dob kivételt a program, ha nem jó adatot adsz meg!

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem a film címét:");
        String title = scanner.nextLine();

        System.out.println("Hány jegyet szeretne?");
        int tickets = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hányadik sorba szeretné?");
        String row = scanner.nextLine();

        System.out.printf("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n" +
                "Vásárló neve: %s\n" +
                "Film címe: %s\n", name, title);
        System.out.print("Lefoglalt helyek: ");

        for (int i = 1; i <= tickets; i++) {
            System.out.printf("%s. sor %d. szék", row, i);
            if (i < tickets) System.out.print(", ");
        }

        System.out.println("\nJó szórakozást!");
    }
}
