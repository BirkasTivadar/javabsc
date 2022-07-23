/*
Hozz létre egy BattleField osztályt, ami használja a karaktereket.
    szükséges attribútumok
        round, hány kör van még (int típusú).
    generálj egy gettert a round attribútumra.
    hozz létre egy private boolean oneHit(Character attacker, Character defender) metódust, amely igazzal tér vissza, ha mindkét karakter él. Törzsében meghívja a támadó (attacker) primaryAttack() majd secondaryAttack() metódusait, melyeknek paramétere a védekező defender, ha még mindkettő él.
    hozz létre egy public Character fight(Character one, Character other) metódust, amely visszatér az élve maradt karakterrel. Törzsében
        mindaddig hívja a privát oneHit metódust felváltva a támadó és védekező szerepeket, amíg valamelyik meg nem hal. Minden körben először a one támadja az other-t, majd az other a one-t.
        közben növeli a round attribútum értékét.
        végül visszatér az élő karakter referenciával.
*/

package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    public Character fight(Character one, Character other) {
        while (oneHit(one, other)) {
            oneHit(other, one);
            round++;
        }
        return one.isAlive() ? one : other;
    }

    private boolean oneHit(Character attacker, Character defender) {
        attacker.primaryAttack(defender);
        attacker.secondaryAttack(defender);
        return attacker.isAlive() && defender.isAlive();
    }

    public int getRound() {
        return round;
    }
}
