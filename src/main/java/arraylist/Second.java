package arraylist;


//Gyakorlati feladat - Minden második
//        A Second osztály main() metódusában hozz létre egy listát a következő számokból, majd írj ki a konzolra közülük minden másodikat!
//        A számok: 3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92);

        for (int i = 1; i < numbers.size(); i += 2) {
            System.out.println(numbers.get(i));
        }
    }

}
