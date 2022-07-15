/*
Mivel a kultúrház eszköz- és hely kapacitásai véglegesek, ezért egyszerre összesen 3 táblán, összesen 6 játékos tud majd játszani. Ha ennél többen jelentkeznek, akkor a többiek az első játszmák lezajlása után kerülnek majd sorra. A ChessTournament osztálynak van egy List<Team> teams attribútuma. Ennek inicializálását a paraméter nélküli konstruktor végzi a következő módon: a listában összesen 3 csapat kapjon helyet, ezek tagjait pedig egy később meghívott metódus állítsa majd be! Az addPlayersToTeams(List<Player> playersRegistrated) metódus megkapja a végleges jelentkezők listáját, majd az első 6 embert beosztja a 3, már korábban létrehozott csapatba. Ha többen jelentkeztek, akkor a többlet emberek kimaradnak. Ha kevesebben, pl. 3-an, akkor pedig belőlük lesz egy teljes csapat és egy egyszemélyes csapat, játékostárs nélkül, valamint marad egy üres csapat (számítanak ugyanis arra, hogy lesz olyan ember, aki majd helyben, a verseny napján kap kedvet és nevez be a versenybe).
*/

package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {

    private final List<Team> teams = new ArrayList<>();

    public ChessTournament() {
        teams.add(new Team());
        teams.add(new Team());
        teams.add(new Team());
    }

    public List<Team> getTeams() {
        return new ArrayList<>(teams);
    }

    public void addPlayersToTeams(List<Player> playersList) {
        int size = playersList.size();
        int playerIndex = 0;
        for (Team team : teams) {
            if (playerIndex < size) team.setPlayerOne(playersList.get(playerIndex++));
            else return;

            if (playerIndex < size) team.setPlayerTwo(playersList.get(playerIndex++));
            else return;
        }
    }
}
