package stringconcat.employee;

//Gyakorlati feladatok
//        A stringconcat csomagba dolgozz!
//        Gyakorlati feladat - Alkalmazott adatai szövegesen
//        Készítsd el az employee.Employee osztályt és annak a toString() metódusát! Az osztály tartalmazza az alkalmazott nevét, foglalkozását és fizetését, melyeket konstruktorban kap meg. A toString() metódus az alkalmazott adatait az alábbi formában adja vissza:
//        Kis Géza - minőségellenőr - 520000 Ft
//        Teszteld az osztály metódusait az EmployeeMain osztályban!

public class Employee {

    private String name;
    private String profession;
    private int salary;

    public Employee(String name, String profession, int salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + profession + " - " + salary + " Ft";
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getSalary() {
        return salary;
    }
}
