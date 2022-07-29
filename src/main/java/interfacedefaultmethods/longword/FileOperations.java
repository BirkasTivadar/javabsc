/*
Hosszú szó
        Hozz létre a test ág resources könyvtárában egy longword.txt nevű fájlt, a következő tartalommal (használhatsz más szót is, másmilyen mátrixban megadva):
        LONG
        ONGW
        NGWO
        GWOR
        WORD
        Hozz létre egy FileOperations interfészt, amely tartalmaz egy default metódust (default List<String> readFromFile(Path path)), amelyben beolvassa a file tartalmát! Legyen az interfészben egy absztrakt metódus is: String getLongWord()! A LongWord osztály implementálja az interfészt, és a getLongWord() metódusa adja vissza a mátrixban rejlő szót! (A szó többféle módon és irányban is kiolvasható a mátrixból, pl. az első sort és a többi sorok utolsó betűjét egymás után olvasva, de más megoldás is jó lehet.)
        A LongWordTest osztályban írd is meg a tesztesetet a metódus működésének ellenőrzésére!
*/

package interfacedefaultmethods.longword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public interface FileOperations {

    default List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    String getLongWord();
}
