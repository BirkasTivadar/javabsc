package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Gyakorlati feladat - Kedvencek listája
//Hozz létre egy Favourites nevű osztályt, amelynek main() metódusában hozz létre egy List<String> favouriteThings listát! Ezután kérd be a felhasználótól néhány kedvencét, például a kedvenc filmjét, színészét, állatát, stb., amelyeket aztán tárolj is el a favouriteThings listában! Végül írd ki a konzolra a lista méretét és tartalmát!

public class Favourites {

    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a kedvenc filmje?");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Mi a kedvenc étele?");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Mi a kedvenc színésze?");
        favouriteThings.add(scanner.nextLine());
        System.out.println("Mi a kedvenc állata?");
        favouriteThings.add(scanner.nextLine());

        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);
    }
}
