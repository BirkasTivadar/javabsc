package classstructureconstructors;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a szerző nevét:");
        String author = scanner.nextLine();

        System.out.println("Kérem a könyv címét:");
        String title = scanner.nextLine();

        Book book = new Book(author, title);

        System.out.println(book.getAuthor() + ": " + book.getTitle());

        System.out.println("\nKérem a regisztráviós számot:");
        book.reigster(scanner.nextLine());

        System.out.println(book.getRegNumber() + " - " + book.getAuthor() + ": " + book.getTitle());
    }
}
