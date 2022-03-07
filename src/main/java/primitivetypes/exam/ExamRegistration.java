package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam();

        boolean morePerson = true;

        while (morePerson) {
            System.out.println("Kérem a vizsgázó nevét:");
            String name = scanner.nextLine();

            System.out.println("Kérem a vizsgázó születési évét:");
            String yearOfBirth = scanner.nextLine();
            System.out.println("Kérem a vizsgázó születési hónapját:");
            String monthOfBirth = scanner.nextLine();
            System.out.println("Kérem a vizsgázó születési napját:");
            String dayOfBirth = scanner.nextLine();

            System.out.println("Kérem a vizsgázó irányítószámát:");
            String zipCode = scanner.nextLine();

            System.out.println("Kérem a vizsgázó jegyeinek átlagát");
            String averageOfMarks = scanner.nextLine();

            Person person = new Person(name, LocalDate.of(Integer.parseInt(yearOfBirth), Integer.parseInt(monthOfBirth), Integer.parseInt(dayOfBirth)), Integer.parseInt(zipCode), Double.parseDouble(averageOfMarks));
            exam.addPerson(person);

            System.out.println("Van még jelentkező? i/n");
            String answer = scanner.nextLine();

            if (answer.equals("n") || answer.equals("N")) {
                morePerson = false;
            }
        }

        System.out.println(exam.getPersonsAppliedForExam());
    }
}
