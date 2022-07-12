package methodoverloading;

public enum Number {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);

    private final int number;

    Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
