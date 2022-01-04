package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első időpont óráját:");
        int hours = scanner.nextInt();
        System.out.println("percét:");
        int minutes = scanner.nextInt();
        System.out.println("másodpercét:");
        int seconds = scanner.nextInt();

        Time firstTime = new Time(hours, minutes, seconds);

        System.out.println("Kérem az második időpont óráját:");
        hours = scanner.nextInt();
        System.out.println("percét:");
        minutes = scanner.nextInt();
        System.out.println("másodpercét:");
        seconds = scanner.nextInt();

        Time secondTime = new Time(hours, minutes, seconds);

        System.out.println("Az első időpont " + firstTime.toString() + " = " + firstTime.getInMinutes() + " perc");
        System.out.println();

        System.out.println("A második időpont " + secondTime.toString() + " = " + secondTime.getInSeconds() + " másodperc");
        System.out.println();

        System.out.println("Az első korábbi, mint a második: " + firstTime.earlierThan(secondTime));


    }
}
