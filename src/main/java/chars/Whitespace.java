package chars;

//Gyakorlati feladat - Nem látható karakterek cseréje
//        A Whitespace osztályban készíts egy makeWhitespaceToStar(String text) metódust, amely úgy adja vissza a paraméterül kapott szöveget, hogy abban az összes whitespace karaktert lecseréli '*' karakterre! Az osztály main() metódusában teszteld!

public class Whitespace {

    public String makeWhitespaceToStar(String text) {
        String result = "";
        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                result += "*";
            } else {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();

        String text = " hello world!  ";

        System.out.println(whitespace.makeWhitespaceToStar(text));
    }
}
