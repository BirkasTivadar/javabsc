package stringbasic.university;

//Gyakorlati feladat - Egyetemi hallgatók nyilvántartása
//        Készíts egy Person osztályt, amely a következő adatokat tartja nyilván: név, e-mail cím, TAJ-szám, bankszámla szám, telefonszám!
//        Majd készíts egy Student osztályt, amelynek legyen egy Person típusú attribútuma, ezenkívül pedig a személy egyetemi tanulmányaihoz szükséges Neptun-kódot és Oktatási Azonosítót is nyilvántartja! Lehessen benne eltárolni egy belépőkártya számot is!
//        Mindkét osztályban legyenek getterek, setterek és konstruktor! A Student konstruktora a belépőkártya számának értékét ne állítsa be, mert kártyája nem automatikusan van minden hallgatónak.
//        Majd legyen egy University osztály, amelynek legyen egy Student listája! A listához legyen getter, valamint egy addStudent(Student student) metódus, amellyel új hallgatót lehet a listához adni!
//        Legyen a University osztályban egy areEqual(Student student, Student anotherStudent) metódus, amely azt adja vissza, hogy a két megadott hallgató ugyanaz-e! (Két hallgatót egyenlőnek tekintünk, ha a Neptun-kódjuk és az Oktatási Azonosítójuk megegyezik.)

public class Person {

    private String name;
    private String email;
    private String ssn;
    private String accountNumber;
    private String phoneNumber;

    public Person(String name, String email, String ssn, String accountNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.ssn = ssn;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
