package algorithmsmax.temperature;

/*
Gyakorlati feladat - Napi minimum hőmérséklet
        Hozz létre egy temperature.Temperature osztályt, valamint benne egy getMin(List<Integer>)metódust, ami paraméterként kap egy listát az elmúlt napon mért hőmérsékleti értékekből, és kiválasztja közülük a legkisebbet.
*/

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> temperatures) {
        return temperatures.stream().mapToInt(i -> i).min().orElse(Integer.MAX_VALUE);

//        int min = Integer.MAX_VALUE;
//        for (int i : temperatures) {
//            if (i < min) {
//                min = i;
//            }
//        }
//        return min;
    }
}
