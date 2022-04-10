package introexceptiontrace.numbers;

import java.util.Arrays;

public class NumbersMain {

    public static void main(String[] args) {
        Change change = new Change();

        int[] changeArr = change.changeNumbers();

        System.out.println(Arrays.toString(changeArr));
     /*
        a RandomOperations osztály getNumbers() metódusában keletkezik a hiba, a tömb bejárása során a for ciklus fejében az
        i <= lengthOfArray;
        helyett a
        i < lengthOfArray;
        kellene szerepeljen
           */
    }
}
