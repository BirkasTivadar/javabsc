package composition.realestate;

//Gyakorlati feladat - Ingatlanhirdetés
//        A realestate csomagban hoz létre egy RealEstate osztályt, mely egy ingatlanhirdetést reprezentál. Legyen neki egy String title, egy double price és egy Details details attribútuma, valamint az osztályban getterek, setterek, konstruktor és egy felülírt toString() metódus!
//        Az ingatlanhirdetés részleteit a Details osztályban lehet megadni. Ennek az osztálynak legyen egy String description, egy Address address, egy int squareMeter, és egy int areaOfSite attribútuma, valamint itt is getterek, setterek, konstruktor és egy felülírt toString() metódus!
//        Az ingatlanhirdetés címét egy Address osztályban lehet megadni. Ennek az osztálynak legyen egy String city, egy String zipCode, egy String street és egy int houseNumber attribútuma, valamint itt is getterek, setterek, konstruktor és egy felülírt toString() metódus!
//        Teszteld az osztályokat A RealEstateDotCom osztály main() metódusában!

public class RealEstate {

    private String title;
    private double price;
    private Details details;

    public RealEstate(String title, double price, Details details) {
        this.title = title;
        this.price = price;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", details=" + details +
                '}';
    }
}
