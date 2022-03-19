package operators;

//Gyakorlati feladatok
//        Az operators csomagba dolgozz!

public class OperatorsMain {

    public static void main(String[] args) {
//        Gyakorlati feladat - Operátorok
//        Az Operators osztályban írd meg az egyes kisebb feladatokat, a konzolra kiírásokat viszont az OperatorsMain osztály main() metódusában végezd!
        Operators operators = new Operators();

//        Írd ki a konzolra egy általad tetszőlegesen választott egész szám kettes számrendszer-beli alakját!
        System.out.println(Integer.toBinaryString(235));

//        Hozz létre egy boolean isEven(int n) metódust, mely visszaadja, hogy a paraméterként átadott egész szám páros-e!
        System.out.println("14 páros: " + operators.isEven(14));
        System.out.println("33 páros: " + operators.isEven(23));

//        Írj egy getResultOfDivision(int number, int divisor) metódust, amely a következőhöz hasonló szöveges formában visszaadja egy osztás eredményét: “16 / 3 = 5, maradék: 1”
        System.out.println(operators.getResultOfDivision(16, 3));

//        Írj egy isNull(String s) metódust, amely a három operandusú operátor használatával eldönti a paraméterként megadott Stringről, hogy null értékű-e vagy sem, és ennek megfelelő szöveget ad vissza (“null értékű” vagy “nem null értékű”)!
        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull(""));
        System.out.println(operators.isNull("hello"));

//        Írj egy isEmpty(String s) metódust, amely igazat ad vissza akkor, ha a paraméterként megadott String üres String vagy null. Minden más esetben false-t adjon vissza! Vigyázz, hogy a feltételeket jó sorrendben add meg!
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty("  "));
        System.out.println(operators.isEmpty("hello"));


    }
}
