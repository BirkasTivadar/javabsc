package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song favoriteSong = new Song();

        System.out.println("Kérem a kedvenc szám előadójának nevét: ");
        favoriteSong.band = scanner.nextLine();
        System.out.println("Kérem a kedvenc szám címét: ");
        favoriteSong.title = scanner.nextLine();
        System.out.println("Kérem a kedvenc szám hosszát (percben): ");
        favoriteSong.length = scanner.nextInt();

        System.out.println(favoriteSong.band + " - " + favoriteSong.title + " (" + favoriteSong.length + " perc)");

    }
}
