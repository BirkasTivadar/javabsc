package introexceptiontrycatchtrace;

/*
Gyakorlati feladat - Számológép
        A CalculatorMain osztályban kérj be a felhasználótól két számot, majd azt is, hogy milyen műveletet szeretne, hogy a számológép elvégezzen ezzel a két számmal! A négy alapművelet közül lehessen választani, osztásnál elég a két egész számot elosztani egymással, valamint ezeket a műveleteket szervezd ki külön a Calculator osztályba, különböző metódusokba! Végül írd ki neki az általa megadott számokkal a művelet eredményét!

        Gondold végig, hogy ebben a kódban hány utasítás végrehajtásánál keletkezhet kivétel, és minden helyen kezeld is le azt a CalculatorMain osztályban!
*/

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Kérem az első számot:");
        String first = scanner.nextLine();

        System.out.println("Kérem az második számot:");
        String second = scanner.nextLine();

        System.out.println("Kérem a matematikai művelet jelét:");
        String operator = scanner.nextLine();

        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;

        try {
            firstNumber = Double.parseDouble(first);
            secondNumber = Double.parseDouble(second);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }

        switch (operator) {
            case "+":
                result = calculator.addition(firstNumber, secondNumber);
                break;
            case "-":
                result = calculator.subtraction(firstNumber, secondNumber);
                break;
            case "*":
                result = calculator.multiplication(firstNumber, secondNumber);
                break;
            case "/":
                try {
                    result = calculator.division(firstNumber, secondNumber);
                } catch (ArithmeticException ae) {
                    System.out.println(ae.getMessage());
                }
                break;
            default:
                System.out.println("Rossz műveleti jel.");
        }

        System.out.println(result);
    }
}
