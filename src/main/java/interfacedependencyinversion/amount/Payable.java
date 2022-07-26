/*
Fizetendő összeg
        Az amount csomagban hozz létre egy Payable nevű interfészt, amelynek legyen egy int getPayableAmount(int amount) absztrakt metódusa! Ezt az interfészt implementálja három különböző osztály:

        Az Amount osztályban úgy implementáld a metódust, hogy az csak adja vissza magát az összeget, mindenféle változtatás nélkül!
        A Cash osztályban viszont úgy, hogy a metódus a magyar fizetési kerekítések szerint adja vissza a fizetendő összeget! (Tehát: Ha a kapott összeg 1-re vagy 2-re végződik, akkor 0-ra kerekít, ha 3-ra, 4-re, 6-ra vagy 7-re, akkor 5-re kerekít, ha pedig 8-ra vagy 9-re, akkor 10-re kerekít. Ha 5-re vagy 0-ra végződik az összeg, akkor nincs kerekítés.)
        Végül a BankAtm osztályban a metódus implementációja kerekítse felfelé, a legközelebbi ezresre az összeget!
        Írd is meg a tesztet mindhárom osztály tesztelésére a PayableTest osztályban, melyben az egyes példányokat Payable statikus típusú változónak adod értékül!
*/

package interfacedependencyinversion.amount;

public interface Payable {

    int getPayableAmount(int amount);
}
