package intromethods.employee;

//Gyakorlati feladat - Alkalmazottak
//        Készítsd el az intromethods.employee csomagba az Employee osztályt, amelyben az alkalmazott nevét (name), belépési évét (hiringYear) és az egész értékű fizetését (salary) tárolod attribútumként!
//        Az osztály példányosításakor mindhárom adatot meg kell adni, a konstruktort ennek megfelelően készítsd el!
//        Minden attribútumához készíts gettert, valamint a name attribútumhoz settert is! A fizetése utólag emelhető, ezért készíts egy raiseSalary() metódust, amely paraméterként megkapja az emelés mértékét forintban, és ennek megfelelően módosítja a fizetést!
//        Generáld le az IDE segítségével a toString() metódust! Milyen alakban jelenik meg egy objektum állapota? Teszteld az osztály metódusait az EmployeeMain osztály main() metódusában!

public class Employee {

    private String name;
    private int hiringYear;
    private int salary;

    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public void raiseSalary(int amount) {
        salary += amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hiringYear=" + hiringYear +
                ", salary=" + salary +
                '}';
    }
}
