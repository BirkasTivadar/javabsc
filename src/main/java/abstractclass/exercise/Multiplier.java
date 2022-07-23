/*
Multiplier osztály: úgy implementálja a getSolution() metódust, hogy visszaadja a paraméterként kapott két szám szorzatát.
*/

package abstractclass.exercise;

public class Multiplier extends MathExercise {

    @Override
    public int getSolution(int a, int b) {
        return a * b;
    }
}
