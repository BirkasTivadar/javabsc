package algorithmsmax.trainer;

/*
Gyakorlati feladat - Legidősebb trainer
        Hozz létre egy trainer.Trainer osztályt a következő attribútumokkal:

        name, a trainer neve
        age , az életkora
        A feladat:

        Egy MaxAgeCalculator osztályban hozz létre egy Trainer getTrainerWithMaxAge(List<Trainer> trainers) metódust, amely kikeresi a legidősebb trainert.
*/


public record Trainer(String name, int age) {
}
