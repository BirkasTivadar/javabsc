package composition.person;

public class Address {

    private String zipCode;
    private String country;
    private String city;
    private String streetAndNumber;

    public Address(String zipCode, String country, String city, String streetAndNumber) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
    }

    public void correctData(String zipCode, String country, String city, String streetAndNumber) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
    }

    public String addressToString() {
        return zipCode + " " + country + ", " + city + ", " + streetAndNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }
}
