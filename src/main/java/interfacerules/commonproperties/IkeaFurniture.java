/*
Majd készíts egy IkeaFurniture osztályt, melynek három attribútuma van: (fantázia)név, hosszúság és szélesség (ez utóbbiak lebegőpontos típusok)! Ez az osztály implementálja mindhárom interfészt, és valósítsa meg úgy a metódusait, hogy mindegyik egyenként a megfelelő attribútum értékét adja vissza! Legyen az osztálynak konstruktora is, mely beállítja az attribútumok értékét!
*/

package interfacerules.commonproperties;

public class IkeaFurniture implements Name, Length, Width {
    private String name;
    private double length;
    private double width;

    public IkeaFurniture(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
