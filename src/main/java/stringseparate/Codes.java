package stringseparate;

import java.util.List;

//Gyakorlati feladat - Kódok
//        A Codes osztályban írj egy String getCodesStartWithLetter(List<String> codes) metódust, amely egy kódokat tartalmazó listát kap paraméterül. Ezek a kódok tetszőleges karakterekből állhatnak. A metódus egy olyan szöveget adjon vissza, melyben vesszővel vannak egymáshoz fűzve a lista elemei közül azok a kódok, amelyek betűvel kezdődnek! Tehát például ilyet: Betűvel kezdődő kódok: T57fbj, xtcu45, f578GVHd

public class Codes {

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");
        for (String code : codes) {
            if (Character.isAlphabetic(code.charAt(0))) {
                if (!sb.toString().equals("Betűvel kezdődő kódok: ")) {
                    sb.append(", ").append(code);
                } else {
                    sb.append(code);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        List<String> codeList = List.of("12Dcfg", "T57fbj", " fggf", "xtcu45", "f578GVHd", "&df345");

        System.out.println(codes.getCodesStartWithLetter(codeList));
    }
}
