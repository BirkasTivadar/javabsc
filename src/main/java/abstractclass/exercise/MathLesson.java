/*
Készíts egy MathLesson osztályt, melynek main() metódusában úgy példányosítsd mind a négy leszármazott osztályt, hogy mindegyiknek a statikus típusa MathExercise legyen! Ezután mind a négy példánynak hívd meg a getSolution() metódusát! Írd ki a konzolra is a kapott eredményeket!
*/

package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {

        MathExercise adder = new Adder();
        MathExercise subtracter = new Subtracter();
        MathExercise multiplier = new Multiplier();
        MathExercise divisor = new Divisor();

        System.out.println(adder.getSolution(9,4));
        System.out.println(subtracter.getSolution(9,4));
        System.out.println(multiplier.getSolution(9,4));
        System.out.println(divisor.getSolution(9,4));
    }
}
