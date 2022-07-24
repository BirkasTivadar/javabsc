/*
Az első állat a kacsa (Duck) lesz, amely implementálja az Animal interfészt úgy, hogy a lábak száma kettő, a név pedig “Duck”.
*/

package interfaces.animal;

public class Duck implements Animal{

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public String getName() {
        return "Duck";
    }


}
