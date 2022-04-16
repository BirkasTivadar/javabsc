package introexceptionwritefile;

/*
Gyakorlati feladat - Születésnapok nyilvántartása
        A Birthday osztályban olyan alkalmazást készíts, mely bekéri a felhasználótól ismerősei vagy családtagjai nevét és születési dátumát, rögzíti egy listában, majd a lista tartalmát kiírja fájlba! A felhasználó adhassa meg, hogy hány adatot kíván rögzíteni! A fájlban egy sorban egy ember adatai szerepeljenek!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> personalDataList = new ArrayList<>();

        System.out.println("Hány személy adatait kívánja rögzíteni?");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= number; i++) {
            StringBuilder sb = new StringBuilder();
            System.out.printf("Kérem a %d. személy nevét:\n", i);
            sb.append(scanner.nextLine()).append(", ");
            System.out.printf("Kérem a %d. személy születési dátumát:\n", i);
            sb.append(scanner.nextLine());
            personalDataList.add(sb.toString());
        }

        try {
            Files.write(Path.of("src/main/resources/personals.txt"), personalDataList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

}
