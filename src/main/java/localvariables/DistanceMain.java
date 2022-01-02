package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(34.56, true);

        System.out.println("A távolság: " + distance.getDistanceKm() +
                ", pontosság: " + distance.isExact());

        int intKm = (int) distance.getDistanceKm();

        System.out.println("\nA távolság egész km-ben: " + intKm);
    }
}
