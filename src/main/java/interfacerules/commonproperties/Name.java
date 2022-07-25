/*
Közös tulajdonságok
        Ebben a feladatban egyszerűen modellezheted, hogyan köthetnek össze két teljesen különböző dolgot a közös tulajdonságaik.

        Készíts egy Name nevű interfészt, benne egy String getName() absztrakt metódussal!
        Készíts egy Length nevű interfészt, benne egy double getLength() absztrakt metódussal!
        Készíts egy Width nevű interfészt, benne egy double getWidth() absztrakt metódussal!
        Készíts egy Equator nevű osztályt, amely static final módosítószókkal ellátott attribútumokban tárolja az Egyenlítő nevét és hosszát, valamint impementálja a Name és a Length interfészeket! Valósítsd meg megfelelő módon a két interfész metódusait!
        Majd készíts egy IkeaFurniture osztályt, melynek három attribútuma van: (fantázia)név, hosszúság és szélesség (ez utóbbiak lebegőpontos típusok)! Ez az osztály implementálja mindhárom interfészt, és valósítsa meg úgy a metódusait, hogy mindegyik egyenként a megfelelő attribútum értékét adja vissza! Legyen az osztálynak konstruktora is, mely beállítja az attribútumok értékét!
        Végül készíts egy ParkingPlace osztályt, amelynek nincs attribútuma, viszont implementálja a Length és a Width interfészeket. Mivel egy használható parkolóhely legkisebb szabványos mérete 2,2 méter x 5 méter, ezért a megvalósított metódusok ezeket az értékeket adják vissza!
*/

package interfacerules.commonproperties;

public interface Name {

    String getName();
}
