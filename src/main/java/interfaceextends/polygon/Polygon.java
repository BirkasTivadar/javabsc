/*
Sokszögek
    A polygon csomagba készítsd el a következő interfészeket és osztályt:
        Side interfész, amelyben van egy double getLengthOfSide() absztrakt metódus.
        Vertex interfész, amelyben van egy int getNumberOfVertices() absztrakt metódus.
        Geometric interfész, amelynek mindkét előző interfész az őse. Ebben az interfészben találhatóak a következő a absztrakt metódusok: double getPerimeter(), int getNumberOfDiagonalsFromOneVertex() és int getNumberOfAllDiagonals()
        Polygon osztály, amelynek van egy double lengthOfSide és egy int numberOfVertices attribútuma, és implementálja a Geometric interfészt.
        Az osztály konstruktora állítsa be a sokszög csúcsai számának és egy oldala hosszának az értékét! Az osztályban implementált metódusok feladata ezen alapadatok segítségével kiszámítani egy sokszög kerületét, valamint egy csúcsból induló átlóinak és összes átlójának számát.
*/

package interfaceextends.polygon;

public class Polygon implements Geometric {

    private final double lengthOfSide;
    private final int numberOfVertices;

    public Polygon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    @Override
    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    @Override
    public double getPerimeter() {
        return lengthOfSide * numberOfVertices;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        return numberOfVertices - 3;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        int result = getNumberOfDiagonalsFromOneVertex();
        for (int i = 3; i < numberOfVertices; i++) {
            result += numberOfVertices - i;
        }
        return result;
    }
}
