package numbers;

//Gyakorlati feladat - Százalékszámítás
//        A Percent osztályba dolgozz!
//        Az osztály main() metódusában teszteld is a metódusokat, a számokat a felhasználótól kérd be!

import java.util.Scanner;

public class Percent {
    public static final String askNumberOne = "Kérem az első számot:";
    public static final String askNumberTwo = "Kérem a második számot:";
    public static final String preResult = "A(z) ";

    //        Írj egy getValue() metódust, mely két egész számot vár paraméterül, és kiszámolja az első számnak a második szám szerinti százalékát! A metódus egy lebegőpontos számmal térjen vissza! (Tehát például ha a megadott két szám 200 és 30, akkor a metódus kiszámolja 200-nak a 30 százalékát, és 60.0-t ad vissza eredményül.)
    public double getValue(int numberOne, int numberTwo) {
        return numberOne * numberTwo / 100.0;
    }

    //        Írj egy getBase() metódust, mely két egész számot vár paraméterül, és kiszámolja, hogy az első szám minek a második szám szerinti százaléka! A metódus egy lebegőpontos számmal térjen vissza! (Tehát ha a metódusnak megadott számok 60 és 30, akkor a metódus visszaadja, hogy melyik számnak a 30 százaléka 60, vagyis 200-at ad vissza eredményül.)
    public double getBase(int numberOne, int numberTwo) {
        return (numberOne / (double) numberTwo) * 100;
    }

    //        Írj egy getPercent() metódust, mely két egész számot vár paraméterül és kiszámolja, hogy az elsőnek hány százaléka a második! A metódus egy lebegőpontos számmal térjen vissza!
    public double getPercent(int numberOne, int numberTwo) {
        return (numberTwo / (double) numberOne) * 100;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);


        System.out.println("getValue() feladat:");
        System.out.println(askNumberOne);
        int numberOne = scanner.nextInt();
        scanner.nextLine();
        System.out.println(askNumberTwo);
        int numberTwo = scanner.nextInt();
        scanner.nextLine();

        double result = percent.getValue(numberOne, numberTwo);
        System.out.println(preResult + numberOne + " " + numberTwo + " százaléka: " + result);


        System.out.println("getBase() feladat:");
        System.out.println(askNumberOne);
        numberOne = scanner.nextInt();
        scanner.nextLine();
        System.out.println(askNumberTwo);
        numberTwo = scanner.nextInt();
        scanner.nextLine();

        result = percent.getBase(numberOne, numberTwo);
        System.out.println(preResult + result + " " + numberTwo + " százaléka: " + numberOne);


        System.out.println("getPercent() feladat:");
        System.out.println(askNumberOne);
        numberOne = scanner.nextInt();
        scanner.nextLine();
        System.out.println(askNumberTwo);
        numberTwo = scanner.nextInt();
        scanner.nextLine();

        result = percent.getPercent(numberOne, numberTwo);
        System.out.println(preResult + numberTwo + " a(z) " + numberOne + " " + result + " százaléka.");

    }
}
