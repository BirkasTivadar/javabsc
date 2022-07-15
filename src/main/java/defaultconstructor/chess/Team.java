/*
Szükség lesz egy Team osztályra is, hiszen a sakk kétszemélyes játék. Egy csapatnak a két, egymás ellen játszó játékos minősül, ennek megfelelően az osztály attribútumai: Player playerOne és Player playerTwo. Konstruktort ebbe az osztályba sem kell írni, mert a csapatok beosztása csak a verseny kezdetekor fog megtörténni.
*/

package defaultconstructor.chess;

public class Team {

    private Player playerOne;
    private Player playerTwo;

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }
}

