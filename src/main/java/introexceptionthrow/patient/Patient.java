package introexceptionthrow.patient;

/*
Gyakorlati feladat - TAJ-szám validálása
        Készítsd el a patient csomagba a Patient osztályt, mely tárolja a beteg nevét, TAJ számát és születési évét! Konstruktorban ellenőrizd a paramétereket, és IllegalArgumentException dobásával jelezd a nem megfelelő értékeket! A name nem lehet üres, a yearOfBirth pedig legalább 1900 legyen! A TAJ-számot is validáld, és ha nem megfelelő, dobj itt is kivételt! A TAJ-szám ellenőrzéséhez hozd létre az SsnValidator osztályt!

        A TAJ számot a következő algoritmussal ellenőrizd:

        A TAJ szám egy kilenc számjegyből álló szám.
        A TAJ szám első nyolc számjegyéből a páratlan helyen állókat hárommal, a páros helyen állókat héttel szorozzuk, majd a szorzatokat összeadjuk.
        Az összeget tízzel elosztva a maradékot tekintjük a kilencedik, azaz ellenőrző kódnak.
        Ha az ellenőrző kód nem egyezik, akkor ne fogadd el a TAJ számot!
        Ne felejtsd el, hogy a számmá konvertálás kivételt dobhat!

        Teszteld az osztály main() metódusában!
*/

public class Patient {

    private final String name;
    private final String socialSecurityNumber;
    private final int yearOFBirth;


    public Patient(String name, String socialSecurityNumber, int yearOFBirth) throws IllegalArgumentException {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;

        if (!new SsnValidator().isValidSsn(socialSecurityNumber)) {
            throw new IllegalArgumentException("Invalid SSN");
        }
        this.socialSecurityNumber = socialSecurityNumber;


        if (yearOFBirth < 1900) {
            throw new IllegalArgumentException("Year of birth must be greater than 1900");
        }
        this.yearOFBirth = yearOFBirth;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOFBirth() {
        return yearOFBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", yearOFBirth=" + yearOFBirth +
                '}';
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Bibi", "031395674", 1973);
        System.out.println(patient);

        try {
            new Patient(" ", "031395674", 1973);

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            new Patient("Bibi", "031395674", 1800);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            new Patient("Bibi", "03139567", 1973);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            new Patient("Bibi", "0ea395674", 1973);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        try {
            new Patient("Bibi", "031395672", 1973);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}


