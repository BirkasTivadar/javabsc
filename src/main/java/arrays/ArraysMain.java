package arrays;

import java.time.Month;
import java.util.Arrays;

public class ArraysMain {

//    Gyakorlati feladat - Hónapok napjainak száma
//    A String numberOfDaysAsString() metódusban definiálj egy numberOfDays nevű változót, mely a hónapok napjainak számát tartalmazza, és add vissza String-ként egy utasítással az értékeit.

    public String numberOfDaysAsString() {
        int[] numberOfDays = new int[12];
        for (int i = 0; i < 12; i++) {
            numberOfDays[i] = Month.of(i + 1).minLength();
        }
        return Arrays.toString(numberOfDays);
    }

//    Gyakorlati feladat - Szorzótábla
//    A multiplicationTableAsString(int size) metódus definiáljon egy size méretű szorzótáblát, és adja vissza az értékeket String-ként egy sorban.

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

//    Gyakorlati feladat - Hőmérsékleti értékek
//    A sameTempValues(double[] day, double[] anotherDay) hőmérsékleti értékeket vár, órai mérésekkel, két napra. Vizsgáld meg, hogy a paraméterként megadott két nap azonos méréseket tartalmazott-e!

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

//    Gyakorlati feladat - Hőmérsékleti értékek és az óraátállítás
//    A sameTempValuesDaylight(double[] day, double[] anotherDay) metódus ugyanúgy hasonlítsa össze az értékeket, de vegye figyelembe a 23 és 25 órás napokat is. Összehasonlítás során mindig a kisebb óraszámot vegye figyelembe alapként, és úgy hasonlítson össze (mindkettőn hívd meg a copyOfRange() metódust)!
//    Implementálhatsz egy min(int, int) segédmetódust, mely a két óraszám közül a kisebbet adja vissza.

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int minDay = min(day.length, anotherDay.length);
        return Arrays.equals(Arrays.copyOfRange(day, 0, minDay), Arrays.copyOfRange(anotherDay, 0, minDay));
    }

    private int min(int a, int b) {
        return a < b ? a : b;
    }

//    Gyakorlati feladat - Lottószámok
//    Döntsd el a boolean wonLottery(int[], int[]) metódusban, hogy a megtett számok, és a kihúzott számok megegyeznek-e! Nem biztos, hogy növekvő sorrendben vannak a számok. Azaz ellenőrizd, hogy ugyanazokat az értékeket tartalmazza-e a két paraméter, sorrendtől függetlenül!
//    Válaszd azt a megoldást, hogy mindkét tömböt rendezed, és úgy hasonlítod őket össze!
//    Miután a main() metódusban meghívtad a wonLottery() metódust, vizsgáld meg, hogy a paraméterként átadott tömb rendezett lett-e, azaz a rendezésnek lett-e visszahatása a paraméterként átadott tömbre! (Ehhez az kell, hogy a paraméterek változók legyenek, melyek értékét a hívás után vizsgálni lehet.)
//    Ha igen, próbáld meg valahogy kikerülni a problémát, azaz a metódusnak ne legyen mellékhatása.

    public boolean wonLottery(int[] numbers, int[] anotherNumbers) {
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        int[] anotherNumbersCopy = Arrays.copyOf(anotherNumbers, anotherNumbers.length);
        Arrays.sort(numbersCopy);
        Arrays.sort(anotherNumbersCopy);
        return Arrays.equals(numbersCopy, anotherNumbersCopy);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.multiplicationTableAsString(3));

        double[] lunes = {12.1, 13.4, 5, 6.7, 11.1, 15.6};
        double[] martes = {13.4, 12.1, 5, 6.7, 11.1, 15.6};
        double[] miercoles = {12.1, 13.4, 5, 6.7, 11.1, 15.6};

        System.out.println(arraysMain.sameTempValues(lunes, martes));
        System.out.println(arraysMain.sameTempValues(lunes, miercoles));
        System.out.println(arraysMain.sameTempValues(martes, miercoles));

        double[] jueves = {12.1, 13.4, 5, 6.7, 11.1, 15.6};
        double[] viernes = {13.4, 12.1, 5, 6.7, 11.1, 15.6};
        double[] sabado = {12.1, 13.4, 5, 6.7, 11.1};

        System.out.println(arraysMain.sameTempValuesDaylight(jueves, viernes));
        System.out.println(arraysMain.sameTempValuesDaylight(jueves, sabado));
        System.out.println(arraysMain.sameTempValuesDaylight(viernes, sabado));

        int[] lotto1 = {1, 2, 3, 4, 5};
        int[] lotto2 = {5, 4, 3, 2, 1};
        int[] lotto3 = {6, 7, 8, 9, 10};

        System.out.println(arraysMain.wonLottery(lotto1, lotto2));
        System.out.println(arraysMain.wonLottery(lotto1, lotto3));
        System.out.println(arraysMain.wonLottery(lotto2, lotto3));
        System.out.println(Arrays.toString(lotto1));
        System.out.println(Arrays.toString(lotto2));
    }
}
