/*
Szállítási költség
    Egy futárcég úgy határozza meg a szállítási árait, hogy csak a feladásra kerülő csomag külső méreteit kell megadni, és ez alapján besorolják a csomagot a négy méretkategória - és egyben árkategória - valamelyikébe.
    Hozd létre a Size enumot, melyben a következő értékek legyenek: S, M, L, XL!
    Majd hozd létre a Box interfészt, amelyben két absztrakt metódust deklarálj: Size getSize() és int getPrice()! Készíts négy osztályt, amelynek mindegyike implementálja az interfészt:
        SmallBox, amely S méretű és 1000 Ft-ért szállítja a futárcég.
        MediumBox, amely M méretű és 2000 Ft a szállítási díja.
        LargeBox, amely L méretű és 3000 Ft-ba kerül a küldése.
        ExtraLargeBox, amely XL méretű és 5000 Ft-ért juttatják célba.

        Végül legyen egy CourierCompany osztályod, amelynek main() metódusában Box statikus típussal példányosítsd mind a négy különböző doboz osztályt, és mindegyiknél írd ki a konzolra a getSize() és a getPrice() metódus által visszaadott értéket!
*/

package interfacedependencyinversion.box;

public interface Box {

    Size getSize();

    int getPrice();
}
