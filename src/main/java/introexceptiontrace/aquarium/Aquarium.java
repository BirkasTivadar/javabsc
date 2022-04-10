package introexceptiontrace.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> ornamentalFish;

    public List<Fish> getOrnamentalFish() {
        return new ArrayList<>(ornamentalFish);
    }

    public void addFish(Fish fish) {
        ornamentalFish.add(fish);
    }

    public int getNumberOfFish() {
        return ornamentalFish.size();
    }

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();

        aquarium.addFish(new Fish("ponty", "sárga"));
        aquarium.addFish(new Fish("keszeg", "ezüst"));
        aquarium.addFish(new Fish("márna", "piros"));

        System.out.println(aquarium.getNumberOfFish());

      /*
        nem lett érték rendelve a List<Fish> ornamentalFish attribútumhoz, ezért nem tud halat hozzáadni.
        helyesen:
        private List<Fish> ornamentalFish = new ArrayList<>();
        */
    }
}
