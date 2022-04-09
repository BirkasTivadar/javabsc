package controliteration.fibonacci;

//Gyakorlati feladat - Fibonacci-sorozat
//        A fibonacci.Fibonacci osztály main() metódusában implementáld, hogy az alkalmazás a Fibonacci sorozatnak a felhasználó által megadott számú elemét írja ki a konzolra! Írd meg a feladatot többféle ciklussal is!

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = 0;
        int numTwo = 1;
        int varNum;

        System.out.println("A Fibonacci sorozat hány elemét szeretné?");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num > 0) {
            System.out.println(numOne);
        }

        if (num > 1) {
            System.out.println(numTwo);
        }

        for (; num > 2; num--) {
            varNum = numOne;
            numOne = numTwo;
            numTwo = varNum + numOne;
            System.out.println(numTwo);
        }

/*
        while (num > 2) {
            varNum = numOne;
            numOne = numTwo;
            numTwo = varNum + numOne;
            System.out.println(numTwo);
            num--;
        }
*/
    }
}
