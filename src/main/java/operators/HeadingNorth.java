package operators;

//Gyakorlati feladat - Arccal északnak
//        A HeadingNorth osztály getNumberOfNewDirections() metódusát úgy írd meg, hogy a következő matematikai feladat megoldását adja vissza:
//        Egy ember elindul észak felé. Pár méter után eltér a haladási irányától jobbra 10 fokos szöggel. Újabb pár méter után ettől a haladási irányától is eltér jobbra 20 fokos szöggel. Ezután mindig megy egy darabig, majd mindig eltér a haladási irányától jobbra 10 fokos szöggel többet, mint azt megelőzően. Hányszor tett ilyen irányváltoztatást addig, amíg újra megint észak felé haladt?
//        Az osztály main() metódusában ellenőrizd a megoldásod!

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int counter = 0;
        int angle = 360;

        angle -= 10;
        counter++;

        angle -= 20;
        counter++;

        while (angle > 0) {
            angle -= 10;
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();

        System.out.println(headingNorth.getNumberOfNewDirections());
    }

}
