/*
Employee osztály double salary attribútummal:
Konstruktor:
public Employee(String name, String address, double salary)
Publikus metódusok:
public double getSalary()
public void raiseSalary(int percent)
*/

package inheritancemethods.employee;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(int percent) {
        salary += salary * percent / 100;
    }
}
