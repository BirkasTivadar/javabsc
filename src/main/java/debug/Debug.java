package debug;

import java.util.Arrays;
import java.util.List;

//Gyakorlati feladat - Rosszul megírt utasítások
//        Hozz létre egy Debug nevű osztályt, melynek main() metódusába másold be a következőket:
//
//        List<String> fruits = Arrays.asList("alma", "körte", "barack", "szilva");
//
//        String peach = fruits.get(2);
//        fruits.set(3, peach);
//        for (int i = 0; i < fruits.size(); i++) {
//        String fruit = fruits.get(i);
//        fruits.contains(fruit.substring(0, 2));
//        }
//        System.out.println(fruits.get(1));
//
//        int[] numbers = {3, 7, -2, 1, -4, 5};
//
//        numbers[2] = 0;
//        for (int i = 0; i < numbers.length; i++) {
//        numbers[2]++;
//        numbers[2]++;
//        }
//        System.out.println(numbers[2]);
//        Az utasítások lefuttatása után a konzolon a következőnek kellene megjelennie:
//
//        ba
//        2
//        A debugger segítségével keresd meg és javítsd ki a hibákat, hogy ezt az elvárt eredményt kapd!

public class Debug {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("alma", "körte", "barack", "szilva");

        String peach = fruits.get(2);
        fruits.set(3, peach);
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            fruits.set(1, fruit.substring(0, 2));
        }
        System.out.println(fruits.get(1));

        int[] numbers = {3, 7, -2, 1, -4, 5};

        numbers[2] = -10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[2]++;
            numbers[2]++;
        }
        System.out.println(numbers[2]);
    }
}
