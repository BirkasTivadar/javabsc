/*
Subtracter osztály: úgy implementálja a getSolution() metódust, hogy visszaadja a paraméterként kapott két szám különbségét.
*/

package abstractclass.exercise;

public class Subtracter extends MathExercise {
    @Override
    public int getSolution(int a, int b) {
        return a - b;
    }
}
