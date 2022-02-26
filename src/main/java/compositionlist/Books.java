package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Gyakorlati feladat - Könyvcímek
//        Készíts egy Books osztályt, melyben egy String típust tartalmazó ArrayList<> tárolja a könyvek címeit! Írj egy addBook(String title) metódust, mely felveszi a könyvet a listába! Ezenkívül legyen egy olyan findBookAndSetAuthor(String title, String author) metódusa, mely először a könyv címe alapján ellenőrzi, hogy a keresett könyv megtalálható-e a listában, ha igen, akkor lekéri az indexét, végül index alapján a könyv címéhez konkatenálja a szerzője nevét is, a következő formában: “Gárdonyi Géza: Egri csillagok”! Ha nincs a listában ilyen című könyv, akkor nem kell csinálni semmit. Ne felejts el getter metódust is készíteni, hogy a lista tartalmát ellenőrzésképp a konzolra tudd írni!
//        Írj egy main() metódust, melyben először kérd be a felhasználótól, hogy hány könyvcímet szeretne eltárolni, majd ciklusban kérd is be tőle ezeket és mentsd el őket a listába! Ezután teszteld a findBookAndSetAuthor() metódust is legalább az egyik könyvcímmel!

public class Books {

    private List<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        int index = books.indexOf(title);
        if (index >= 0) {
            String book = author + ": " + title;
            books.set(index, book);
        }
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        System.out.println("Hány könyvcímet szeretne megadni?");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.println("Kérem a(z) " + (i + 1) + ".-ik könyv címét:");
            String title = scanner.nextLine();
            books.addBook(title);
        }

        System.out.println(books.getBooks());

        System.out.println("Kérem a könyv címét: ");
        String title = scanner.nextLine();

        System.out.println("Kérem a könyv szerzőjét: ");
        String author = scanner.nextLine();

        books.findBookAndSetAuthor(title, author);
        System.out.println(books.getBooks());
    }
}
