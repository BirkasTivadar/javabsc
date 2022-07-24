/*
A harmadik állat a féreg (Worm) legyen, amely implementálja az Animal interfészt úgy, hogy a lábak száma nulla, a név pedig “Worm”.
*/

package interfaces.animal;

public class Worm implements Animal{

    @Override
    public int getNumberOfLegs() {
        return 0;
    }

    @Override
    public String getName() {
        return "Worm";
    }
}
