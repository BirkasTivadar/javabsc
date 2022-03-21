package typeconversion;

public class Conversion {

//    Gyakorlati feladat - Double-ből double
//    Írj egy convertDoubleToDouble() nevű metódust, amely paraméterként egy double típusú számot kap, ennek először vágja le a törtrészét (ehhez tedd int típusú változóba a számot), majd az így kapott számot újra double típusúként adja vissza!

    public double convertDoubleToDouble(double number) {
        int result = (int) number;
        return (double) result;
    }


    //    Gyakorlati feladat - Egész számokból egész számok
//    Írj egy convertIntArrayToByteArray() nevű metódust, amely paraméterként egy int tömböt kap. Ebben a tömbben tetszőleges egész számok vannak. A metódus feladata az, hogy adjon vissza egy ugyanilyen hosszú byte tömböt, amelyben a 0-127 közötti egész számok ugyanazon a helyen szerepelnek, mint a paraméterként kapott tömbben, ám a 0-nál kisebb vagy 127-nél nagyobb számok helyén -1 áll.
//    Tehát abban az esetben, ha a metódus a következő számokat tartalmazó tömböt kapja paraméterül: 5, -14, 6, 2, 125, 354, 9738, 3
//    Ekkor a metódusnak a következő elemeket tartalmazó byte tömböt kell visszaadnia: 5, -1, 6, 2, 125, -1, -1, 3

    public byte[] convertIntArrayToByteArray(int[] intArray) {
        int length = intArray.length;
        byte[] result = new byte[length];

        for (int i = 0; i < length; i++) {
            int actualNumber = intArray[i];
            if (actualNumber < 0 || actualNumber > 127) {
                result[i] = -1;
            } else {
                result[i] = (byte) actualNumber;
            }
        }
        return result;
    }


//    Gyakorlati feladat - Az első tizedesjegy
//    Írj egy getFirstDecimal() nevű metódust, amely paraméterként kap egy double típusú számot, és annak az első tizedesjegyével tér vissza. (Ennek menete a következő: a lebegőpontos számot egész számmá kell konvertálni, a konvertáltat kivonni az eredetiből, az eredményt megszorozni tízzel és újra egész számmá konvertálni.)

    public int getFirstDecimal(double number) {
        int subtrahend = (int) number;
        double result = number - subtrahend;

        return Math.abs((int) (result * 10));
    }
}
