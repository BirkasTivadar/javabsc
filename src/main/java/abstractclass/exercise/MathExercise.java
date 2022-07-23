/*
Matekfeladat
Készíts egy absztrakt exercise.MathExercise osztályt, amelynek legyen összesen egy absztrakt metódusa: int getSolution(int a, int b)! Készíts négy következő osztályt, mindegyik a MathExercise osztály leszármazottja legyen:
Adder osztály: úgy implementálja a getSolution() metódust, hogy visszaadja a paraméterként kapott két szám összegét.
Subtracter osztály: úgy implementálja a getSolution() metódust, hogy visszaadja a paraméterként kapott két szám különbségét.
Multiplier osztály: úgy implementálja a getSolution() metódust, hogy visszaadja a paraméterként kapott két szám szorzatát.
Divisor osztály: úgy implementálja a getSolution() metódust, hogy visszaadja a paraméterként kapott két szám hányadosát (lefelé kerekítve).

Készíts egy MathLesson osztályt, melynek main() metódusában úgy példányosítsd mind a négy leszármazott osztályt, hogy mindegyiknek a statikus típusa MathExercise legyen! Ezután mind a négy példánynak hívd meg a getSolution() metódusát! Írd ki a konzolra is a kapott eredményeket!
*/

package abstractclass.exercise;

public abstract class  MathExercise {

    public abstract int getSolution(int a, int b);
}
