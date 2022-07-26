/*
Végül legyen egy CourierCompany osztályod, amelynek main() metódusában Box statikus típussal példányosítsd mind a négy különböző doboz osztályt, és mindegyiknél írd ki a konzolra a getSize() és a getPrice() metódus által visszaadott értéket!
*/

package interfacedependencyinversion.box;

public class CourierCompany {

    public static void main(String[] args) {
        Box smallBox = new SmallBox();
        Box mediumBox = new MediumBox();
        Box largeBox = new LargeBox();
        Box extraLargeBox = new ExtraLargeBox();

        System.out.println(smallBox.getSize() + " " + smallBox.getPrice());
        System.out.println(mediumBox.getSize() + " " + mediumBox.getPrice());
        System.out.println(largeBox.getSize() + " " + largeBox.getPrice());
        System.out.println(extraLargeBox.getSize() + " " + extraLargeBox.getPrice());
    }
}
