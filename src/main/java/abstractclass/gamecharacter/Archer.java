/*
Hozz létre egy Archer osztályt, amely kiterjeszti a Character osztályt a következőképpen:
    szükséges attribútumok
        numberOfArrow, hány nyíl van még (int típusú).
    hozz létre egy konstruktort, amely megkapja a nyilas pozícióját és erre állítja be a position örökölt attribútumot. Állítsa be a numberOfArrow attribútum értékét 100-ra.
    generálj gettert a numberOfArrow attribútumra.
    hozz létre egy privát getActualSecondaryDamage metódust, ami visszaad egy 1 és 5 közötti egész véletlen értéket.
    definiálj egy shootingAnArrow privát metódust, amely megkapja az ellenséges karakter referenciáját (enemy). Csökkenti a nyilak számát numberOfArrow, és meghívja a hit örökölt metódusát a kapott ellenséges karakter referenciával, és a getActualSecondaryDamage metódus visszatérési értékével.
    implementáld az örökölt secondaryAttack metódust úgy, hogy meghívod az előzőleg definiált privát shootingAnArrow metódust, átadva a kapott enemy paramétert.
*/

package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {
    private int numberOfArrow;

    public Archer(Point position, Random random) {
        super(position, random);
        this.numberOfArrow = 100;
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(5) + 1;
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
