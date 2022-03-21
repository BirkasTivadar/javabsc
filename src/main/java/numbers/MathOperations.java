package numbers;

import java.util.Scanner;

//Gyakorlati feladat - Matematikai feladat
//        Készíts egy MathOperations osztályt! A main() metódusában írj ki a felhasználónak egy négy alapműveletet és zárójeleket tartalmazó számítási feladatot, majd kérd be tőle az eredményt! Ellenőrizd a kapott értéket, és jelezd vissza, hogy helyesen oldotta-e meg a feladatot. A megengedett eltérés 0.0001 legyen
//        A Scanner osztályt használhatod double típusú adatok bekérésére is. A nextDouble() metódusa a futtató operációs rendszer alapértelmezett formátumában értelmezi a beírt szöveget, azaz magyar környezet esetén a választ tizedesvesszőt használva kell megadni, például 5,342.

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mennyi a (2+3) * 4 - (5/6)");
        double answer = scanner.nextDouble();

        double result = (2 + 3) * 4 - (5 / 6.0);

        System.out.println(Math.abs(result - answer) < 0.0001);
    }
}
