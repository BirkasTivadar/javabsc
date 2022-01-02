package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store tomato = new Store("tomato");
        Store miel = new Store("miel");

        System.out.println(tomato.getProduct() + ": " + tomato.getStock());
        System.out.println(miel.getProduct() + ": " + miel.getStock());

        System.out.println("Mennyi paradicsom jött?");
        tomato.store(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Mennyi méz jött?");
        miel.store(scanner.nextInt());
        scanner.nextLine();

        System.out.println(tomato.getProduct() + ": " + tomato.getStock());
        System.out.println(miel.getProduct() + ": " + miel.getStock());

        System.out.println("Mennyi paradicsomot vittek el?");
        tomato.dispatch(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Mennyi mézet vittek el?");
        miel.dispatch(scanner.nextInt());

        System.out.println(tomato.getProduct() + ": " + tomato.getStock());
        System.out.println(miel.getProduct() + ": " + miel.getStock());

    }
}
