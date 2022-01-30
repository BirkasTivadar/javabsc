package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {
        Address address = new Address("9023", "Győr", "Kodály Z u.", 35);
        Details details = new Details("panel", address, 62, 36);
        RealEstate realEstate = new RealEstate("eladó lakás", 21_673.99, details);

        System.out.println(realEstate);
    }
}
