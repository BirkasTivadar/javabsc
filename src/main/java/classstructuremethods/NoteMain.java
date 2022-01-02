package classstructuremethods;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Note note = new Note();

        System.out.println("Kérem a jegyzet nevét: ");
        note.setName(scanner.nextLine());
        System.out.println("Kérem a jegyzet témáját: ");
        note.setTopic(scanner.nextLine());
        System.out.println("Kérem a jegyzet szövegét: ");
        note.setText(scanner.nextLine());

        System.out.println("\nA jegyzet: ");
        System.out.println(note.getNoteText());
    }
}
