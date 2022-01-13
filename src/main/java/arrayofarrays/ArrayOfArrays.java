package arrayofarrays;

//Az ArrayOfArrays osztályban hozz létre egy printArrayOfArrays(int[][] a) metódust, mely kiírja a következő tömbök tömbjét:
//
//        0 1 2
//        0 1 2
//        0 1 2
//        0 1 2
//        A beágyazott tömbök elemeit egymás mellé, a külső tömb elemeit egymás alá.
//
//        A main() metódusban hozd létre ezt a tömbök tömbjét és teszteld le a metódus működését!

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {
        for (int[] arr : a) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{0, 1, 2}, {0, 1, 2,}, {0, 1, 2}, {0, 1, 2}};

        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();

        arrayOfArrays.printArrayOfArrays(a);
    }
}
