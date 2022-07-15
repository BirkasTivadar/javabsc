/*
Sakkverseny
        A chess csomagba dolgozz!
        Egy kis falu kultúrháza sakkversenyt hirdet, amire várják a jelentkezőket. Jelentkezni úgy lehet, hogy először csak egy egyedi jeligét kell leadni, ez még csak egy “helyfoglalást” jelent, és majd később, a verseny előtt pár nappal kell véglegesíteni a tényleges részvételi szándékot. Ekkor kerülnek ténylegesen rögzítésre a jelentkező adatai. Aki nem véglegesíti a jelentkezését, annak a helyfoglalását törlik.
        A jelentkezés modellezését a Player osztály végzi. Az osztályba nem kell konstruktort írni, hiszen kezdetben nem kell végleges adatokat (név és e-mail cím) eltárolni egy-egy jelentkező játékoshoz. Kellenek viszont setter metódusok, hogy később be lehessen állítani ezeket.
        Szükség lesz egy Team osztályra is, hiszen a sakk kétszemélyes játék. Egy csapatnak a két, egymás ellen játszó játékos minősül, ennek megfelelően az osztály attribútumai: Player playerOne és Player playerTwo. Konstruktort ebbe az osztályba sem kell írni, mert a csapatok beosztása csak a verseny kezdetekor fog megtörténni.
        Mivel a kultúrház eszköz- és hely kapacitásai véglegesek, ezért egyszerre összesen 3 táblán, összesen 6 játékos tud majd játszani. Ha ennél többen jelentkeznek, akkor a többiek az első játszmák lezajlása után kerülnek majd sorra. A ChessTournament osztálynak van egy List<Team> teams attribútuma. Ennek inicializálását a paraméter nélküli konstruktor végzi a következő módon: a listában összesen 3 csapat kapjon helyet, ezek tagjait pedig egy később meghívott metódus állítsa majd be! Az addPlayersToTeams(List<Player> playersRegistrated) metódus megkapja a végleges jelentkezők listáját, majd az első 6 embert beosztja a 3, már korábban létrehozott csapatba. Ha többen jelentkeztek, akkor a többlet emberek kimaradnak. Ha kevesebben, pl. 3-an, akkor pedig belőlük lesz egy teljes csapat és egy egyszemélyes csapat, játékostárs nélkül, valamint marad egy üres csapat (számítanak ugyanis arra, hogy lesz olyan ember, aki majd helyben, a verseny napján kap kedvet és nevez be a versenybe).
*/

package defaultconstructor.chess;

public class Player {

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
