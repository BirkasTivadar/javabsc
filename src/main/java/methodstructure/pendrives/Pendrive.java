package methodstructure.pendrives;

/*
Gyakorlati feladat - Pendrive-ok
        Készíts egy pendrives.Pendrives osztályt, amely metódusaival pendrive-ok közül lehet kikeresni a megfelelőt! A feladat részeként készíts egy Pendrive osztályt is!

        A Pendrive tagjai:

        attribútumai: name, capacity, price. A kapacitás egész szám GB-ban megadott érték. Az ár egész szám forintban megadott érték.
        Legyenek getterei az attribútumokra!
        Legyen String toString() metódusa, amely egy Stringbe összefűzve adja vissza a pendrive adatait!
        Legyen void risePrice(int percent) metódusa, amely megadott százalékkal megemeli a pendrive árát!
        Legyen int comparePricePerCapacity(Pendrive other) metódusa, amely összehasonlítja a példányt egy paraméterként kapott másik példánnyal az ár/kapacitás alapján! Az eredmény 1 legyen, ha az aktuális (a metódust hívó) példány ár/kapacitása nagyobb, illetve az eredmény -1 legyen, ha a paraméterként kapott példányé nagyobb, végül az eredmény 0 legyen, ha egyformák!
        Legyen egy boolean isCheaperThan(Pendrive other) metódusa, amely igazat ad ha a metódust hívó példány ára kisebb, mint a paraméterben kapott példány ára.
        A Pendrives részletei: A metódusokat úgy implementáld, hogy nem hívod a Pendrive getPrice() metódusát.

        Legyen Pendrive getBest(List<Pendrive>) metódusa, amely a legjobb ár/kapacitás értékű pendrive-t adja vissza, azaz amelyiknél ez a legkisebb.
        Legyen Pendrive getCheapest(List<Pendrive>) metódusa, amely a legolcsóbbat adja vissza.
        Legyen void risePriceWhereCapacity(List<Pendrive>, int percent, int capacity) metódusa, amely adott százalékkal megemeli azon pendrive-ok árát, amelynek a kapacitása a megadott értékkel megegyezik.
*/

public class Pendrive {
    private final String name;
    private final int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent) {
        price *= (1 + (percent / 100.0));
    }

    public int comparePricePerCapacity(Pendrive other) {
        return Double.compare(getPricePerCapacity(), other.getPricePerCapacity());
//        if (getPricePerCapacity() > other.getPricePerCapacity()) return 1;
//        if (getPricePerCapacity() < other.getPricePerCapacity()) return -1;
//        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return price < other.getPrice();
    }

    private double getPricePerCapacity() {
        return (double) price / capacity;
    }
}
