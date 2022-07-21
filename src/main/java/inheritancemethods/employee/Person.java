/*
Munkahelyi hierarchia
Az employee csomagban található Person, Employee, Boss és BigBoss osztályok egy munkahelyi hierarchiát reprezentálnak, a fenti sorrendben egymásból öröklődő osztályok. A különböző alkalmazottak fizetését eltérő módon számítjuk. Míg az Employee alapfizetéssel rendelkezik, a Boss esetében az alapfizetéshez hozzáadódik a vezetői pótlék (beosztottak száma * LEADERSHIP_FACTOR * alapfizetés), és a BigBoss esetében ehhez hozzáadódik egy vezetői prémium is (bonus).

Person osztály String name és String address attribútumokkal:
Konstruktor:
public Person(String name, String address)
Publikus metódus:
public void migrate(String newAddress)

Employee osztály double salary attribútummal:
Konstruktor:
public Employee(String name, String address, double salary)
Publikus metódusok:
public double getSalary()
public void raiseSalary(int percent)

Boss osztály LEADERSHIP_FACTOR = 0.1 és int numberOfEmployees attribútumokkal:
Konstruktor:
public Boss(String name, String address, double salary, int numberOfEmployees)
Publikus metódusok:
public double getSalary()
public int getNumberOfEmployees()

BigBoss osztály double bonus attribútummal:
Konstruktor:
public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus)
Publikus metódusok:
public int getNumberOfEmployees()
public double getBonus()
public double getSalary()
*/

package inheritancemethods.employee;

public class Person {

    private final String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void migrate(String newAddress) {
        address = newAddress;
    }
}
