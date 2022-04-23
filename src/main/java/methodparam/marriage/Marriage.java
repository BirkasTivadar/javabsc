package methodparam.marriage;

/*
Ezután pedig legyen egy Marriage osztály, amelyben van egy getMarried(Woman woman, Man man) metódus, amely beállítja mindkét félnél a házasságkötés adatait.

        Az egyes kisebb műveleteket szervezd ki külön metódusokba! Állítsa be egy külön privát metódus a hölgy házasságkötés után használatos nevét! Ezt szabadon választhatod. Tegyük fel, hogy mindketten egy vezetéknévvel és egy keresztnévvel rendelkeztek a házasságkötés előtt! Legyen külön privát metódus arra is, hogy a mai nap, mint a házasságkötés dátuma bekerüljön az anyakönyvi dátumaik közé a listába úgy, hogy "házasságkötés ideje", 2021-10-25 (az aktuális mai dátummal, természetesen)!
*/

import java.time.LocalDate;

public class Marriage {

    private RegisterDate getRegisterDateOfMarriage() {
        return new RegisterDate("házasságkötés ideje", LocalDate.now());
    }

    private void setMarriedName(Woman woman, Man man) {
        String preName = man.name().split(" ")[0];
        woman.setName(preName + "-" + woman.getName());
    }

    public void getMarried(Woman woman, Man man) {
        man.addRegisterDate(getRegisterDateOfMarriage());
        woman.addRegisterDate(getRegisterDateOfMarriage());
        setMarriedName(woman, man);
    }
}
