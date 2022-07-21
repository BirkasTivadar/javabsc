/*
BigBoss osztály double bonus attribútummal:
Konstruktor:
public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus)
Publikus metódusok:
public int getNumberOfEmployees()
public double getBonus()
public double getSalary()
*/


package inheritancemethods.employee;

public class BigBoss extends Boss {

    private final double bonus;

    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
