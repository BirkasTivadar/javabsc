package references.dogs;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        Dog vizsla = new Dog("Berci", 12, "brown");
        Dog gascoigne = new Dog("Alfi", 5, "black-grey");
        Dog kuvasz = new Dog("Flótás", 7, "white");

        dogs.add(vizsla);
        dogs.add(gascoigne);
        dogs.add(kuvasz);
        System.out.println(dogs);

        Dog fourth = dogs.get(0);
        fourth.setColour("grey");
        System.out.println(dogs);

        Dog puli = new Dog("Bogáncs", 6, "black");
        System.out.println(puli);

        puli = dogs.get(0);
        System.out.println(puli);

        dogs.add(puli);
        System.out.println("dogs: " + dogs);

        Dog sixth = fourth;
        sixth.setColour("red");
        System.out.println("dogs: " + dogs);

        List<Dog> dogList = dogs;

        Dog seventh = fourth;
        seventh.setColour("blue");
        System.out.println("dogList: " + dogList);

        gascoigne = null;
        System.out.println(gascoigne);
        System.out.println("dogs: " + dogs);
        System.out.println("dogList:" + dogList);

        Dog eigth = dogs.get(0);
        eigth = null;
        System.out.println("dogs: " + dogs);
        System.out.println("dogList:" + dogList);


        Dog ninth = dogs.get(0);
        ninth.setColour("green");
        System.out.println("dogs: " + dogs);
        System.out.println("dogList:" + dogList);

    }
}
