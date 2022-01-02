package conventions;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A kocsi típusa?");
        String carType = scanner.nextLine();

        System.out.println(("A motor típusa"));
        String engineType = scanner.nextLine();

        System.out.println("Ajtók száma?");
        int doors = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ülések száma?");
        int persons = scanner.nextInt();
        scanner.nextLine();

        Car car = new Car(carType, engineType, doors, persons);

        System.out.println("\nAz autó típusa: " + car.getCarType() +
                "\nmotor típusa: " + car.getEngineType() +
                "\najtók száma: " + car.getDoors() +
                "\nülések száma: " + car.getPersons());

        System.out.println("\nAz új motor típusa");
        car.setEngineType(scanner.nextLine());

        System.out.println("\nAz autó típusa: " + car.getCarType() +
                "\nmotor típusa: " + car.getEngineType() +
                "\najtók száma: " + car.getDoors() +
                "\nülések száma: " + car.getPersons());


    }
}
