/*
A Cash osztályban viszont úgy, hogy a metódus a magyar fizetési kerekítések szerint adja vissza a fizetendő összeget! (Tehát: Ha a kapott összeg 1-re vagy 2-re végződik, akkor 0-ra kerekít, ha 3-ra, 4-re, 6-ra vagy 7-re, akkor 5-re kerekít, ha pedig 8-ra vagy 9-re, akkor 10-re kerekít. Ha 5-re vagy 0-ra végződik az összeg, akkor nincs kerekítés.)
*/

package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        return (int) Math.round(amount / 5.0) * 5;
    }
}
