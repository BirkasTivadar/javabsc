/*
Végül a BankAtm osztályban a metódus implementációja kerekítse felfelé, a legközelebbi ezresre az összeget!
*/

package interfacedependencyinversion.amount;

public class BankAtm implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        return (int) Math.ceil(amount / 1000.0) * 1000;
    }
}
