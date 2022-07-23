/*
Divisor osztály: úgy implementálja a getSolution() metódust, hogy visszaadja a paraméterként kapott két szám hányadosát (lefelé kerekítve).
*/

package abstractclass.exercise;

public class Divisor extends MathExercise {

    @Override
    public int getSolution(int a, int b) {
        return a / b;
    }
}
