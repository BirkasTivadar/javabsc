package debug;

//Gyakorlati feladat - Csillagok
//        Hozd létre a Star osztályt, amelybe másold bele a következő két metódust!
//
//public void writeStars(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//        int prev = 0;
//        int stars = numbers[i] - prev;
//        printStars(stars);
//        prev = numbers[i];
//        System.out.println();
//        }
//        }
//
//private void printStars(int stars) {
//        for (int i = 1; i <= stars; i++) {
//        System.out.print("*");
//        }
//        }
//        Majd az osztály main() metódusában példányosíts egy Star példányt, és definiálj egy olyan egész számokból álló tömböt, amelyben csak nemnegatív számok vannak, valamint a számok növekvő sorrendben követik egymást! Ha ezután meghívod a writeStars() metódust, aminek paraméterül átadod ezt a tömböt, akkor a metódus jelenlegi formájában sorban kiírja a tömb számainak megfelelő számú csillagot, mindegyiket külön sorba. Tehát pl. a következő számokat tartalmazó tömb esetén: 1, 3, 5, 10, 12
//        a következő lesz a konzolon az eredmény:
//
//        *
//        ***
//        *****
//        **********
//        ************
//        A debugger segítségével keresd meg, mit kellene változtatni a metóduson ahhoz, hogy ugyanezen számokat tartalmazó tömb esetén a következő eredményt kapd (minden számból kivonja az előtte lévőt, és a kapott eredménynek megfelelő számú csillagot írja ki a konzolra):
//
//        *
//        **
//        **
//        *****
//        **

public class Star {

    public void writeStars(int[] numbers) {
        int prev = 0;
        for (int number : numbers) {
            int stars = number - prev;
            printStars(stars);
            prev = number;
            System.out.println();
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Star star = new Star();
        int[] numbers = {1, 3, 5, 10, 12};

        star.writeStars(numbers);
    }
}
