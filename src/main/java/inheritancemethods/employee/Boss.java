/*
Boss osztály LEADERSHIP_FACTOR = 0.1 és int numberOfEmployees attribútumokkal:
Konstruktor:
public Boss(String name, String address, double salary, int numberOfEmployees)
Publikus metódusok:
public double getSalary()
public int getNumberOfEmployees()
*/

package inheritancemethods.employee;

public class Boss extends Employee {

    private static final double LEADERSHIP_FACTOR = 0.1;

    private final int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * (1 + numberOfEmployees * LEADERSHIP_FACTOR);
    }
}
