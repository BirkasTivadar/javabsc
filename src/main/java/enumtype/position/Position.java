package enumtype.position;

public enum Position {

    DIRECTOR(1000000, "Oficina, secretario, coche"),
    JEFE(650000, "Oficina, secretario"),
    GERENTE(500000, "Coche, móvil"),
    EMPLEAOD(300000, "Móvil");

    private final int salary;

    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
