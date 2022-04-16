package introexceptionwritefile;

/*
Gyakorlati feladat - Teendők listája
        A ToDo osztályban készíts egy alkalmazást, amivel teendőket lehet bejegyezni egy listába! Írd ki a felhasználónak, hogy adja meg a következő todo-t, és amit megad, azt mentsd el egy listába! Majd ezután addig adhasson meg újabb todo-kat, amíg az “x” billentyű megnyomásával nem jelzi, hogy befejezte, ki lehet írni fájlba a teendőket! Ezután pedig írd ki a megadott teendőket egy todos.txt nevű fájlba!
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        String str = "";

        while (!str.equals("x")) {
            System.out.println("Kérem a következő teendőt:");
            str = scanner.nextLine();
            if (!str.isBlank() && !str.equals("x")) {
                tasks.add(str);
            }
        }

        try {
            Files.write(Path.of("src/main/resources/todos.txt"), tasks);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }
}
