package composition.person;

//Gyakorlati feladat - Egy személy és a címe
//        Hozz létre egy person.Person osztályt, String name, String identificationCard attribútumokkal! Az osztályban hozz létre egy String personToString() metódust, mely szövegként adja vissza a Person adatait!
//        Hozz létre egy Address osztályt, String country, String city, String streetAndNumber, String zipCode attribútumokkal! Az osztályban hozz létre egy String addressToString() metódust, mely szövegként adja vissza az Address adatait!
//        Az attribútumok konstruktorban is megadhatóak legyenek, és legyenek getter metódusok! Legyen egy correctData() metódus mindkét osztályban, mellyel be lehet állítani új értéket minden attribútumhoz!
//        A Person osztály tartalmazzon egy hivatkozást az Address osztályra! (Azaz legyen a Person osztálynak egy Address típusú attribútuma! Legyen egy moveTo(Address) metódus, mely beállítja a címet, és egy getAddress(), mellyel lekérdezhetővé válik!
//        Teszteld az osztályokat a PersonMain osztály main() metódusában!

public class Person {

    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard, Address address) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;
    }

    public void moveTo(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String personToString() {
        return name + ", " + identificationCard + "\n" + address.addressToString();
    }

    public void correctData(String name, String identificationCard, Address address) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;
    }
}
