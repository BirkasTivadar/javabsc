package javabeans;

/*
Gyakorlati feladat - Ember osztály
        Hozz létre egy ember (Human) Java Bean osztályt, amely a következő attribútumokat tartalmazza:

        name: szöveges típusú
        weight: valós típusú
        iq: egész típusú
*/

public class Human {
    private String name;
    private double weight;
    private int iq;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
