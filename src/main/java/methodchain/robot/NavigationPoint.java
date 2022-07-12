package methodchain.robot;

public record NavigationPoint(int distance, int azimut) {

    @Override
    public String toString() {
        return "distance: " + distance + " azimut: " + azimut;
    }
}
