package chars;

//Gyakorlati feladat - Arrébb tolt szó
//        A Words osztályban legyen egy pushWord(String word) metódus, amely paraméterként vár egy szót, és visszaadja azt a Stringet, amelyet úgy kapunk, hogy a szó minden egyes karakterét eggyel arrébb toljuk. Tehát ha a megadott szó az, hogy alma, akkor azt kell visszakapnunk, hogy bmnb. Az osztály main() metódusában teszteld!

public class Words {

    public String pushWord(String word) {
        String result = "";
        for (char c : word.toCharArray()) {
            c = ++c;
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Words words = new Words();

        String apple = "alma";

        System.out.println(words.pushWord(apple));
    }
}
