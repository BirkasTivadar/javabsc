package intromethods.registration;

import java.time.LocalDate;

//Gyakorlati feladat - Regisztráció
//        A feladat egy egyszerű regisztrációs alkalmazás készítése az intromethods.registration csomagba.
//        Ehhez először készíts egy Person osztályt, melynek három attribútuma a következő: String name, LocalDate dateOfBirth és String email. Mindegyikhez legyen getter, valamint legyen az osztálynak egy konstruktora, mely mindhárom attribútum értékét várja. Legyen ezenkívül egy toString() metódusa, mely ne az IDE által generált szöveget adja vissza, hanem legyen alkalmas arra, hogy a személy regisztrációs adatait könnyen olvasható formában megjelenítse!
//        Készíts ezután egy Registration osztályt, melynek main() metódusába írd bele a regisztrációs folyamatot! A felhasználótól kérd be sorban az adatait a következő módon:
//        Kérd be külön a vezeték- és külön a keresztnevét, majd írj egy metódust a Registration osztályban, amely ezt a két adatot várja paraméterül, és visszaadja a személy teljes nevét!
//        Kérd be a születési adatait úgy, hogy külön az évet, külön a hónapot és külön a napot, majd írj egy metódust (szintén a Registration osztályba), mely ezeket várja paraméterül, és visszaadja a személy születési dátumát, LocalDate típusként.
//        Majd kérd be az e-mail címét.
//        Végül példányosíts le egy Person-t, amelyhez a Registration osztályban megírt metódusok által visszaadott értékeket használd, és írd ki a felhasználónak (a Person-ben felülírt toString() segítségével), hogy milyen adatokkal regisztrált!

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private String email;

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Neve: " + name
                + "\nSzületett: " + dateOfBirth
                + "\nEmail: " + email;
    }
}
