package algorithmsmax;

/*
Gyakorlati feladat - Repülőgéppel az óceán fölött
        A Plane osztályban írd meg a getLongestOcean(String map) metódust, amely adja vissza a következő feladat megoldását:

        Egy repülőgéppel átszeljük az óceánt és a közben méréseket végzünk. Tudjuk, hogy partól indulunk és parthoz érünk. A méréseket adott időközönként egyenletesen végezzük. A mérések azt mutatják, hogy sziget vagy óceán fölött repülünk éppen. Az 1-es szigetet míg a 0 óceánt jelöl. pl.: 111000010100001 sorozatban egy három “hosszú” sziget majd négy hosszú “óceán”, aztán sziget, víz, sziget, majd óceán és végül egy szigeten leszálltunk. A feladat az, hogy “repüljünk” a térkép fölött végig és határozzuk meg a leghosszabb óceán szakasz hosszát. A térkép fölött csak egyszer repülhetünk el és amikor leszálltunk már tudnunk is kell az eredményt.

        A térkép: 10000000111110000000000001111111111000010000010000100000111111110000101000000000111110000000000000000100000001000000000000111111000000000100000000000011
*/

public class Plane {
    public int getLongestOcean(String map) {
        int count = 0;
        int max = 0;
        char[] mapChar = map.toCharArray();
        for (char c : mapChar) {
            if (c == '0') {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
//        String[] mapArr = map.split("1");
//        return Arrays.stream(mapArr).mapToInt(String::length).max().getAsInt();
    }
}
