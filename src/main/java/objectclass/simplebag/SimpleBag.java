/*
A táska tartalma
A SimpleBag osztály egy tetszőleges számú Object típusú objektumot tartalmazó adatszerkezetet reprezentál, a Book és Beer osztályok a kipróbálását segítik. A tartalmazott objektumok között lehetnek azonosak is. A SimpleBag osztály a tartalmazott objektumokat egy List<Object> items attribútumban tárolja, és saját metódusai vannak az adatszerkezet kezelésére. Az adatszerkezet bejárása a “kurzor” szemlélettel lehetséges. A kurzor a létrehozáskor az első elem előtt áll, és bármikor újra idehelyezhető a beforeFirst metódus meghívásával. Azaz a bejárás megismételhető.

Konstruktor:
public SimpleBag()

Publikus metódusok:
public void putItem(Object item)
public boolean isEmpty()
public int size()
public void beforeFirst()
public boolean hasNext()
public Object next()
public boolean contains(Object item)
public int getCursor()

A Book osztály String author és String title attribútumokkal rendelkezik:
Konstruktor:
public Book(String author, String title)

A Beer osztály String name és int price attribútumokkal rendelkezik:
Konstruktor:
public Beer(String name, int price)
*/

package objectclass.simplebag;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private int cursor;
    private final List<Object> objects;

    public SimpleBag() {
        cursor = 0;
        objects = new ArrayList<>();
    }

    public void putItem(Object item) {
        objects.add(item);
    }

    public boolean isEmpty() {
        return objects.isEmpty();
    }

    public int size() {
        return objects.size();
    }

    public void beforeFirst() {
        cursor = 0;
    }

    public boolean hasNext() {
        return cursor < objects.size() - 1;
    }

    public Object next() {
        return objects.get(cursor++);
    }

    public boolean contains(Object item){
       return objects.contains(item);
    }

    public int getCursor() {
        return cursor;
    }
}
