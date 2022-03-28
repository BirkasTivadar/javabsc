package stringseparate;

import java.util.ArrayList;
import java.util.List;

//Gyakorlati feladatok
//        A stringseparate csomagba dolgozz!
//        Gyakorlati feladat - Fagyi
//        Az IceCream osztályban írd ki egy fagyizó listáját a konzolra, az egyes fajtákat vesszővel elválasztva egymástól. Bíztasd is a vásárlókat valamilyen akcióval! Például így:
//        Ma kapható: csoki, vanília, eper, citrom, puncs. Gyerekeknek féláron!

public class IceCream {

    List<String> iceCreams;

    public IceCream(List<String> iceCreams) {
        this.iceCreams = new ArrayList<>(iceCreams);
    }

    public void printIceCreams() {
        System.out.print("Ma kapható: ");
        int length = iceCreams.size();
        for (int i = 0; i < length; i++) {
            System.out.print(iceCreams.get(i));
            if (i == length - 1) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
        System.out.print(" Gyerekeknek féláron! Fél Áronnak egész áron!");
    }

    public static void main(String[] args) {
        List<String> iceCreams = List.of("csoki", "vanília", "eper", "citrom", "puncs");
        IceCream iceCream = new IceCream(iceCreams);

        iceCream.printIceCreams();
    }
}
