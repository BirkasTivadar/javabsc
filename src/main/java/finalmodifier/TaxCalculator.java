package finalmodifier;

import java.util.Scanner;

//Gyakorlati feladat - Bruttó ár
//        Írj egy finalmodifier.TaxCalculator osztályt, mely tartalmazza az ÁFA értékét, ami 27%. Írj egy double tax(double price) metódust, mely a paraméterként megadott érték ÁFA értékét számolja, és egy double priceWithTax(double) metódust, mely az árat adja vissza az ÁFA-val együtt!

public class TaxCalculator {

    public static final int IVA = 27;

    public double tax(double price) {
        return price * IVA / 100;
    }

    public double priceWithTax(double price) {
        return price + tax(price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println("Mennyi az ár:");
        double price = scanner.nextDouble();

        System.out.println("Az ÁFA értéke: " + taxCalculator.tax(price));
        System.out.println("A bruttó ár: " + taxCalculator.priceWithTax(price));
    }
}
