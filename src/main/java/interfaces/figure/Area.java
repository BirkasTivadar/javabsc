/*
Gyakorlati feladat - Síkidomok
        Hozd létre a figure csomagot és abban az Area interfészt, amelyben egyetlen absztrakt metódus van: double getArea() Implementálja ezt az interfészt három különböző osztály: a Triangle, a Rectangle és a Circle, és mindegyik valósítsa meg az interfészben foglalt metódust a megfelelő módon! A területek számolásához szükséges adatokat minden osztályban attribútumként vedd fel, és az adott osztály konstruktora állítsa be ezeknek az értékét!
*/

package interfaces.figure;

public interface Area {

    double getArea();
}
