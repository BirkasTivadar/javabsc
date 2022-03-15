package enumtype.solarsystem;

public enum SolarSystem {

    MERCURY(8),
    VENUS(2),
    EARTH(1),
    MARS(2),
    JUPITER(5),
    SATURN(6),
    URANUS(3),
    NEPTUNE(4),
    PLUTO(0);

    private final int numberOfMoon;

    SolarSystem(int numberOfMoon) {
        this.numberOfMoon = numberOfMoon;
    }

    public int getNumberOfMoon() {
        return numberOfMoon;
    }
}
