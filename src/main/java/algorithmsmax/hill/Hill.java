package algorithmsmax.hill;

/*
Gyakorlati feladat - A legmagasabb hegycsúcs
        Hozz létre egy hill.Hill osztályt, és benne egy getMax(List<Integer>) metódust, ami paraméterként kap egy listát hegycsúcsok méterben mért magassági értékeivel, és kiválasztja közülük a legnagyobbat.
*/

import java.util.List;

public class Hill {
    public int getMax(List<Integer> hillTops) {
        return hillTops.stream().mapToInt(i -> i).max().orElse(Integer.MIN_VALUE);
//        int max = Integer.MIN_VALUE;
//        for(int i: hillTops){
//            if(i>max){
//                max = i;
//            }
//        }
//        return max;
    }
}
