package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

//Gyakorlati feladat - Objektumok
//        A objects.ObjectsMain osztály main() metódusába dolgozz!
//        Hozz létre egy Book osztályt, melynek ne legyen sem attribútuma, sem metódusa!
//        Példányosíts egy Book objektumot, de ne add értékül semminek! Meg tudod ezt tenni? Hozzá tudsz férni később?
//        A System.out.println() metódus paramétereként adj át egy, a paraméterben most példányosított objektumot! Mit ír ki?
//        Deklarálj egy Book típusú emptyBook változót, de ne adj neki értéket, hanem azonnal írd ki az értékét! Fog sikerülni?
//        Adj neki értéket, méghozzá a null literált! Írasd ki az értékét!
//        Vizsgáld meg, hogy az emptyBook változó értéke null érték-e! Írd ki a vizsgálat eredményét!
//        Definiálj egy book nevű változót, és adj értékül neki egy újonnan példányosított Book objektumot!
//        Írasd ki a book változó értékét!
//        Adj értéket neki, null literált, majd írd ki az értékét!
//        Adj neki értékül egy új Book példányt, majd írd ki!
//        Hozz létre egy anotherBook változót, és adj értékül neki egy új Book példányt!
//        Hasonlítsd össze egyenlőség operátorral (==) a book és az anotherBook változó értékét, és írd ki az eredményt!
//        Az anotherBook változó értékéül add a book változó értékét! Írd ki!
//        Hasonlítsd össze egyenlőség operátorral (==) a book és az anotherBook változó értékét, és írd ki az eredményt!

    public static void main(String[] args) {

        new Book();

        System.out.println(new Book());

        Book emptybook;

//        System.out.println(emptybook);

        emptybook = null;

        System.out.println(emptybook);
        boolean emtybookIsNull = emptybook == null;
        System.out.println(emtybookIsNull);

        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);
        Book anotherBook = new Book();

        boolean bookIsEqualAnotherBook = book == anotherBook;
        System.out.println(bookIsEqualAnotherBook);

        anotherBook = book;
        System.out.println(anotherBook);
        bookIsEqualAnotherBook = book == anotherBook;
        System.out.println(bookIsEqualAnotherBook);


//    Gyakorlati feladat - Objektumok száma
//    A következő kód hány objektumot hoz létre? A futás végére mennyi objektumhoz lehet hozzáférni?

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

//        A objects.ObjectsMain osztály main() metódusába dolgozz!
//                Definiálj egy Book tömböt, és adj értékül neki egy tömb literált, három példányosított Book objektummal!
//                Definiálj egy List<Book> listát, és az Arrays.asList() metódust használva tegyél bele három példányosított elemet!
//                Definiálj egy List<Book> üres listát, majd külön utasításokban adj hozzá három példányosított objektumot!
//                Írd ki a tömb és a listák tartalmát a konzolra!

        Book[] books = {new Book(), new Book(), new Book()};
        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> bookAnotherList = new ArrayList<>();
        bookAnotherList.add(book1);
        bookAnotherList.add(book2);
        bookAnotherList.add(book3);

        System.out.println(Arrays.toString(books));
        System.out.println(bookList);
        System.out.println(bookAnotherList);

    }
}
