/*
Az Amount osztályban úgy implementáld a metódust, hogy az csak adja vissza magát az összeget, mindenféle változtatás nélkül!
*/

package interfacedependencyinversion.amount;

public class Amount implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        return amount;
    }
}
