package introexceptionthrow;

/*
Gyakorlati feladat - Regisztrációs adatok validálása
        A Registration osztályban implementálj egy egyszerű regisztrációs folyamatot, melynek során bekérsz adatokat a felhasználótól és azokat validálod egy külön Validation osztályban megírt metódusokkal! A folyamat menete a következő legyen:

        Üdvözöld a felhasználót!
        Kérd be a felhasználó nevét! A nevet add át egy void validateName(String name) metódusnak validálásra, amely dobjon IllegalArgumentException kivételt, ha a megadott név null értékű vagy üres.
        Kezeld le a Registration osztályban az esetlegesen keletkezett kivételt úgy, hogy kiírod a felhasználónak a kivétel üzenetét! A kivétel keletkezése ellenére ne álljon meg a regisztráció menete!
        Ezután kérd be a felhasználó életkorát! A megadott adatot add át egy void validateAge(String ageString) metódusnak validálásra! A metódus dobjon IllegalArgumentException kivételt, ha a megadott adat üres String, ha nem szám, vagy ha nem 0 és 120 közé esik! Természetesen minden esetben adj meg egy megfelelő üzenetet is a kivételnek!
        Kezeld le itt is a Registration osztályban az esetlegesen keletkezett kivételt úgy, hogy kiírod a felhasználónak a kivétel üzenetét! A kivétel keletkezése ellenére itt se álljon meg a regisztráció menete!
        Majd írd ki a felhasználónak, hogy milyen adatokat adott meg!
        Végül írd ki, hogy sikeres volt-e a regisztráció! (Természetesen ha vagy a név, vagy az életkor vagy egyik sem volt megfelelő, a regisztráció ne legyen sikeres!)
*/

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean validRegistration = true;

        System.out.println("Üdvözlöm!\nKérem a nevét:");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            validRegistration = false;
        }

        System.out.println("Kérem az életkorát:");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            validRegistration = false;
        }

        System.out.printf("Your name: %s\n", name);
        System.out.printf("Your age: %s\n", age);
        System.out.printf("Your registration is %b", validRegistration);

    }


}
