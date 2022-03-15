package enumtype.university;

public enum University {
    BME("Budapesti Műszaki Egyetem"),
    SZE("Széchenyi István Egyetem"),
    PTE("Pécsi Tudomány Egyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
