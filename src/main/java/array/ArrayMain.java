package array;

public class ArrayMain {

    public static void main(String[] args) {

//        Definiálj egy String tömböt a hét napjaival! Írd ki a második elemét (kedd)! Írd ki a tömb hosszát is!

        String[] days = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println(days[1]);
        System.out.println(days.length);

//        Definiálj egy öt elem hosszú int tömböt, amely a kettő hatványait fogja tartalmazni (1, 2, 4, 8, 16)! Ciklusban töltsd fel értékekkel! Az algoritmus az, hogy mindig az előző elem értékét szorozd meg kettővel! Ciklusban írd ki az értékeit egy sorba, szóközökkel elválasztva!
        int[] powersOfTwo = new int[5];

        for (int i = 0; i < 5; i++) {
            powersOfTwo[i] = i == 0 ? 1 : powersOfTwo[i - 1] * 2;
        }

        for (int powerOfTwo : powersOfTwo) {
            System.out.print(powerOfTwo + " ");
        }

        System.out.println();

//        Definiálj egy hat elemű boolean tömböt, és felváltva írj bele true vagy false értéket, 0. index esetén legyen false! Ciklusban töltsd fel! Az algoritmus az, hogy mindig az előző elemnek veszed a logikai negáltját. Ciklusban írd ki az elemeit egy sorba, szóközökkel elválasztva!
        Boolean[] sixBool = new Boolean[6];

        for (int i = 0; i < 6; i++) {
            sixBool[i] = i != 0 && !sixBool[i - 1];
        }

        for (boolean bool : sixBool) {
            System.out.print(bool + " ");
        }

    }
}
