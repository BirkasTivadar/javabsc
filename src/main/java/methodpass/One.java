package methodpass;

/*
Gyakorlati feladat - Adj hozzá egyet!
        A One nevű osztályban írd meg a következőket:

        Először hozz létre egy main() metódust, amelyben definiálj egy number nevű, egész szám típusú változót! Írd ki az értékét a konzolra!
        Adj hozzá egyet, majd írd ki az értékét újra!
        Ezután készíts egy int addOne(int number) metódust, amely hasonlót csinál: paraméterül kap egy egész számot, ahhoz hozzáad 1-et, majd visszaadja a kapott értéket.
        A main() metódusban ezután úgy adj hozzá a number változó értékéhez 1-et, hogy az addOne() metódust használod erre a célra! Írd ki a konzolra a kapott értéket!
        Majd írd ki a konzolra újra a number változó értékét!
*/

public class One {

    public int addOne(int number) {
        number++;
        return number;
    }

    public static void main(String[] args) {
        int number = 21;
        System.out.println(number);

        number++;
        System.out.println(number);

        One one = new One();
        System.out.println(one.addOne(number));
        System.out.println(number);
    }
}
