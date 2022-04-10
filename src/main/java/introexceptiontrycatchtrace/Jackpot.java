package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {
        Winner winner = new Winner();

        String nameOfWinner = null;

        try {
            nameOfWinner = winner.getWinner();
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }

        System.out.println(nameOfWinner);
    }
}
