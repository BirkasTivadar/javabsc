package typeconversion;

import java.util.Arrays;

//Gyakorlati feladatok
//        A typeconversion.Conversion osztályba dolgozz, a tesztelést a typeconversion.ConversionMain osztály main() metódusában végezd!

public class ConversionMain {

    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(34.56));

        int[] testArray = {5, -14, 6, 2, 125, 354, 9738, 3};
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(testArray)));

        System.out.println(conversion.getFirstDecimal(12.34));
        System.out.println(conversion.getFirstDecimal(-256.678));
    }
}
