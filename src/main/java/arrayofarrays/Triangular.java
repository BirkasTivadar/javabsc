package arrayofarrays;

//A Triangular osztályban hozz létre egy int[][] triangularMatrix(int size) metódust, mely a paraméterként megadott méretű háromszögmátrixot hozza létre, és minden sora a sor számának értékeit tartalmazza! Elég, ha csak egyjegyű számokkal írható ki szépen a konzolra. Ilyen kiírást várunk:
//
//        0
//        1 1
//        2 2 2
//        3 3 3 3

public class Triangular {

    public int[][] triangularMatrix(int size) {
        int[][] result = new int[size + 1][];
        for (int i = 0; i <= size; i++) {
            result[i] = new int[i + 1];
            int row = result[i].length;
            for (int j = 0; j < row; j++) {
                result[i][j] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();

        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();

        arrayOfArrays.printArrayOfArrays(triangular.triangularMatrix(2));
    }
}
