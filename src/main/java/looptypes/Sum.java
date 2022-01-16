package looptypes;

//Gyakorlati feladat - Számok összege
//        A Sum osztályban legyen egy printSums(int[] numbers) metódus, amely kiírja a konzolra egymás mellé a tömbben minden egymás mellett álló két szám összegét!
//        Tehát ha a megadott tömb elemei: {2, 6, 3, 5, 7, 9}, akkor ez szerepeljen a konzolon: 8 9 8 12 16

public class Sum {

    public void printSums(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + numbers[i + 1] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 6, 3, 5, 7, 9};

        Sum sum = new Sum();

        sum.printSums(numbers);
    }
}
