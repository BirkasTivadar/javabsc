package attributes.bill;

//Gyakorlati feladat - Számla
//        Legyen egy attributes.bill.BillItem osztály, melynek legyen egy String product, egy int price, egy int quantity és egy double vatPercent attribútuma! Legyen az osztályban konstruktor, valamint legyenek getter metódusok! Legyen egy calculateTotalPrice() metódus is, mely kiszámolja az ár, a mennyiség és az ÁFA százalék alapján az adott számlatétel teljes összegét!
//        A Bill osztály main() metódusával teszteld!

public class Bill {

    public static void main(String[] args) {
        BillItem car = new BillItem("car", 257_000, 3, 0.27);
        System.out.println(car.calculateTotalPrice());

        BillItem bread = new BillItem("bread", 12, 10, 0.05);
        System.out.println(bread.calculateTotalPrice());
    }
}
