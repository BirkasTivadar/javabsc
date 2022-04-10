package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

//Gyakorlati feladat - Kódolt üzenet
//        A Message osztály main() metódusában hozd létre a következő listát:
//        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
//        Ez a lista karakterkódokat tartalmaz, amelyeket ha számmá alakítasz és utána char típussá, majd megfelelő módon a konzolra írod, egy szöveges üzenetetet kapsz.
//        Ha ezzel kész vagy, hozz létre egy másik listát a következő módon:
//        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46");
//        Ezzel a listával is ugyanúgy járj el, mint az előzővel!
//        Hol keletkezik a kivétel és miért? A kiderítésében segítségedre lesz a konzolon megjelenő hibaüzenet és az IDEA Debugger.

public class Message {

    public static void main(String[] args) {
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");

        for (String str : codedMessage) {
            int code = Integer.parseInt(str);
            char codeChar = (char) code;
            System.out.println(codeChar);
        }

        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46");
        for (String str : anotherCodedMessage) {
            int code = Integer.parseInt(str);
            char codeChar = (char) code;
            System.out.println(codeChar);
        }

// hátulról ötötdik 'számban' van a hiba 'O' betű van a '0' helyett
    }
}
