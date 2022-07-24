/*
A második állat az oroszlán (Lion) lesz, amely implementálja az Animal interfészt úgy, hogy a lábak száma négy, a név pedig “Lion”
*/

package interfaces.animal;

public class Lion implements Animal{

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public String getName() {
        return "Lion";
    }
}
