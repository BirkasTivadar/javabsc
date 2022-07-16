/*
Konstruktorok hívási lánca
        Az animal csomagba dolgozz!
        Hozd létre az Animal osztályt osztályt az alábbi tartalommal:
public class Animal {

    public Animal() {
        super();
        System.out.println("Animal class constructor");
    }
}
    Hozd létre a Bird osztályt osztályt az alábbi tartalommal:
public class Bird extends Animal {

    public Bird() {
        super();
        System.out.println("Bird class constructor");
    }
}
    Hozd létre a Sparrow osztályt osztályt az alábbi tartalommal:
public class Sparrow extends Bird {

    public Sparrow() {
        super();
        System.out.println("Sparrow class constructor");
    }
}
    Végül hozz létre egy AnimalMain osztályt, melynek main() metódusában példányosíts egy Sparrow típusú objektumot! Mit látsz a konzolon a main() metódus lefuttatása után?
*/

package inheritanceconstructor.animal;

public class Animal {

    public Animal() {
        super();
        System.out.println("Animal class constructor");
    }
}

