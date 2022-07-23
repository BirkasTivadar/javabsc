/*
Adder osztály: úgy implementálja a getSolution() metódust, hogy visszaadja a paraméterként kapott két szám összegét.
*/

package abstractclass.exercise;

public class Adder extends MathExercise {
    @Override
    public int getSolution(int a, int b) {
        return a + b;
    }
}
