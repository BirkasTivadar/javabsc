package training;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("What's your year of birth?");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println(2021 - yearOfBirth);
    }
}
