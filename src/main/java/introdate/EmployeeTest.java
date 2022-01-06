package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az új kolléga nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem a születési évét:");
        int year = scanner.nextInt();
        System.out.println("Hónapot:");
        int month = scanner.nextInt();
        System.out.println("Napot:");
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Az új munkatárs");
        System.out.println("neve: " + employee.getName());
        System.out.println("születési dátuma: " + employee.getDateOfBirth());
        System.out.println("Munkába állás időpontja: " + employee.getBeginEmployment());
    }
}
