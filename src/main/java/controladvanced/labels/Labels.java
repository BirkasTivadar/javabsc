package controladvanced.labels;

//Gyakorlati feladat - Címkézés
//        Másold be a labels.Labels osztályba a következő metódust:
//public int[][] getTableOfNumbers(int number) {
//        int[][] table = new int[number][number];
//        table[0][0] = 1;
//        for (int i = 0; i < number; i++) {
//        for (int j = 0; j < number; j++) {
//        table[i][j] = (i + 1) + (j + 1);
//        }
//        }
//        return table;
//        }
//        Címkézd meg a vezérlő utasításokat a lecke szövegében foglaltaknak megfelelően! Ezek után írj tesztet a metódus működésének tesztelésére! (Elég úgy tesztelni, hogy kiválasztasz egy értéket a metódus által visszaadott tömbök tömbjéből, és azt adod meg elvárt értéknek.)

public class Labels {

    public int[][] getTableOfNumbers(int number) {
        int[][] table = new int[number][number];
        table[0][0] = 1;
        OUTER:
        for (int i = 0; i < number; i++) {
            INNER:
            for (int j = 0; j < number; j++) {
                table[i][j] = (i + 1) + (j + 1);
            }
        }
        return table;
    }
}
