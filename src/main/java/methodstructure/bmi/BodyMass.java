package methodstructure.bmi;

/*
Gyakorlati feladat - Testtömegindex
        Készíts egy bmi.BodyMass osztályt, amely testtömegindexet számol! Adatai: tömeg (kilogrammban megadva), magasság (méterben megadva).

        Publikus metódusai:

        Getterek (getWeight, getHeight)

        double getBodyMassIndex(): visszaadja a testtömegindexet, használja a következő képletet: tömeg osztva a magasság négyzetével!

        BmiCategory getBody(): visszaadja a testalkatot (BmiCategory legyen egy enum):

        ha a bmi (bodymassindex) < 18.5, akkor BmiCategory.UNDERWEIGHT
        ha bmi > 25, akkor BmiCategory.OVERWEIGHT
        különben BmiCategory.NORMAL
        boolean isThinnerThan(BodyMass other): igazat ad, ha a példányom (tehát amelyen meghívjuk a metódust) bmi-je kisebb, mint a paraméterként kapott példányé
*/

public record BodyMass(double weight, double height) {

    private static final double BMI_MAX = 25;
    private static final double BMI_MIN = 18.5;

    public double getBodyMassIndex() {
        return weight / (height * height);
    }

    public BmiCategory getBody() {
        if (getBodyMassIndex() < BMI_MIN) return BmiCategory.UNDERWEIGHT;
        if (getBodyMassIndex() > BMI_MAX) return BmiCategory.OVERWEIGHT;
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass bmUnder) {
        return getBodyMassIndex() < bmUnder.getBodyMassIndex();
    }
}
