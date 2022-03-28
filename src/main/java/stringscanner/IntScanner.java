package stringscanner;

import java.util.Scanner;

//Gyakorlati feladat - Számsor konvertálása
//        Az IntScanner osztályban legyen egy convertInts(String ints) metódus, mely paraméterül egy ehhez hasonló szöveget vár: "5;3;107;12;123;18;198", tehát egész számokat pontosvesszővel elválasztva! A metódus Scanner segítségével olvassa be a számokat, és adja vissza a 100-nál nagyobb számokat vesszővel elválasztva, szintén szövegként! A fenti bemeneti adat esetén tehát az elvárt kimenet a következő: "107,123,198"

public class IntScanner {

    public String convertInts(String ints) {
        StringBuilder sb;
        try (Scanner intScan = new Scanner(ints).useDelimiter(";")) {
            sb = new StringBuilder();
            while (intScan.hasNext()) {
                int number = Integer.parseInt(intScan.next());
                if (number > 100) {
                    if (!sb.isEmpty()) {
                        sb.append(",").append(number);
                    } else {
                        sb.append(number);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();

        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
        System.out.println(intScanner.convertInts("107"));
        System.out.println(intScanner.convertInts("5;2;3;7;89;10"));
        System.out.println(intScanner.convertInts("5"));
        System.out.println(intScanner.convertInts(""));
    }
}
