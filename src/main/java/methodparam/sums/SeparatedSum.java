package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SeparatedSum {
    public String readFromFile() {
        String result;
        try {
            Path path = Path.of("src/main/resources/floatingnumbers.txt");
            result = Files.readString(path);

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return result;
    }

    public Sums sum(String floatingNumbers) {
        double positives = 0;
        double negatives = 0;
        String floatsString = floatingNumbers.replace(",", ".");
        String[] floatsArray = floatsString.split(";");
        for (String floatString : floatsArray) {
            double floatNumber = Double.parseDouble(floatString);
            if (floatNumber >= 0) positives += floatNumber;
            else negatives += floatNumber;
        }
        return new Sums(positives, negatives);
    }
}
