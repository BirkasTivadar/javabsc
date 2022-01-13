package arrayofarrays;

//A Rectangle osztályban hozz létre egy int[][] rectangularMatrix(int size) metódust, mely a paraméterként megadott méretű négyszögmátrixot hozza létre, és minden sora a sor számának értékeit tartalmazza! Elég, ha csak egyjegyű számokkal írható ki szépen a konzolra. Ilyen kiírást várunk:
//
//        0 0 0 0
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3

public class Rectangle {

    public int[][] rectangularMatrix(int size) {
        int[][] result = new int[size + 1][size + 1];
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                result[i][j] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();

        arrayOfArrays.printArrayOfArrays(rectangle.rectangularMatrix(3));
    }
}
