package attributes.book;

//Gyakorlati feladat - Egy könyv és a címe
//        Hozz létre egy attributes.book.Book osztályt, és legyen egy String title attribútuma! Hozz létre egy konstruktort, mely egy paraméteres és értéket ad a title attribútumnak! Hozz létre egy setTitle() metódust, mely értéket ad a title attribútumnak! Hozz létre egy getTitle() metódust, mely lekéri az értékét!
//        Teszteld a BookMain main() metódusában!

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("Csendes Don");
        Book book2 = new Book("Winnetou");

        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());

        book2.setTitle("Csingacsguk");
        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
    }
}
