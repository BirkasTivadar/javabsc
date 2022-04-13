package introexceptionthrow;

/*
Gyakorlati feladat - Rendelő
        Készítsd el a Patient osztályt, mely tárolja a beteg nevét, TAJ számát és születési évét!

        Konstruktorban ellenőrizd a paramétereket, és IllegalArgumentException dobásával jelezd a nem megfelelő értékeket!

        A name nem lehet üres, a yearOfBirth pedig legalább 1900 legyen! Teszteld az osztály main() metódusában!
*/

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name must be not empty");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;

        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Year of birth must be greater than 1900");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Patient validPatient = new Patient("John", "123456789", 1973);
        System.out.println(validPatient);

        Patient patientWithInvalidName = null;
        try {
            patientWithInvalidName = new Patient("", "4321", 1950);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        System.out.println(patientWithInvalidName);

        Patient patientWithInvalidYearOfBirth = null;
        try {
            patientWithInvalidYearOfBirth = new Patient("Joe", "333", 1898);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        System.out.println(patientWithInvalidYearOfBirth);
    }
}
