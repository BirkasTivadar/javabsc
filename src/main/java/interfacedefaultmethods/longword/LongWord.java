/*
A LongWord osztály implementálja az interfészt, és a getLongWord() metódusa adja vissza a mátrixban rejlő szót! (A szó többféle módon és irányban is kiolvasható a mátrixból, pl. az első sort és a többi sorok utolsó betűjét egymás után olvasva, de más megoldás is jó lehet.)
*/

package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> longWordPartsList = readFromFile(path);
        StringBuilder result = new StringBuilder(longWordPartsList.get(0));
        for (int i = 1; i < longWordPartsList.size(); i++) {
            String word = longWordPartsList.get(i);
            result.append(word.substring(word.length() - 1));
        }
        return result.toString();
    }
}
