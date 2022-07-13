package methodchain;

public enum Direction {
    POSITIVE (1),
    NEGATIVE (-1);

    public final int length;

    Direction(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
