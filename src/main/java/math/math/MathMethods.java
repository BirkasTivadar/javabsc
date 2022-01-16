package math.math;

//Gyakorlati feladat - A Math osztály kipróbálása
//        A math.math.MathMethods osztályban készíts egy main() metódust, amelyben konzolra íratsz ki különböző értékeket! Mindegyik esetben a Math osztály valamely (statikus) metódusára lesz szükséged.
//        Próbáld ki a Math.max(int a, int b) metódust, amely a két megadott szám közül a nagyobbat fogja visszaadni!
//        Próbáld ki ennek a párját (Math.min())!
//        Írasd ki a Pi értékét!
//        Majd a következő sorban kerekítsd a Pi értékét (round() metódus)!
//        Kerekíts egy általad, tetszőlegesen megadott lebegőpontos számot!
//        Írasd ki egy általad megadott egész vagy lebegőpontos szám abszolútértékét!
//        Írasd ki egynek az ellentettjét (negáltját) !
//        Kérd vissza két egész szám összegét (addExact() metódus) !
//        Kérd vissza két egész szám különbségét (subtractExact() metódus) !
//        Írasd ki két egész szám szorzatát (multiplyExact() metódus) !
//        Majd két lebegőpontos szám hatványát (pow() metódus) !
//        Keresd meg a Math osztály azon metódusát, amely egy megadott számnál eggyel nagyobbat ad vissza!
//        Ezután azt, amely eggyel kevesebbet!
//        Végül kérj egy random lebegőpontos számot 0.0 és 1.0 között a Math.random() metódussal!

public class MathMethods {

    public static void main(String[] args) {

        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(3, 5));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(5.68));
        System.out.println(Math.abs(-6.68));
        System.out.println(Math.negateExact(5));
        System.out.println(Math.addExact(5, 6));
        System.out.println(Math.subtractExact(5, 6));
        System.out.println(Math.multiplyExact(5, 6));
        System.out.println(Math.pow(5, 6));
        System.out.println(Math.incrementExact(5));
        System.out.println(Math.decrementExact(5));
        System.out.println(Math.random());
    }
}
