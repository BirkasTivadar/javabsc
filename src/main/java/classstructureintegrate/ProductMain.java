package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A termék neve?");
        String productName = scanner.nextLine();

        System.out.println("A termék ára?");
        int productPrice = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(productName, productPrice);

        System.out.println(product.getName() + ": " + product.getPrice());

        System.out.println("Mennyivel nőtt a " + product.getName() + " ára?");
        product.increasePrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println(product.getName() + ": " + product.getPrice());

        System.out.println("Mennyivel csökkent a " + product.getName() + " ára?");
        product.decreasePrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println(product.getName() + ": " + product.getPrice());

    }
}
