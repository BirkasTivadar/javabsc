package algorithmsmax.trainer;

import java.util.Comparator;
import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        return trainers.stream().max(Comparator.comparingInt(Trainer::age)).get();
//        Trainer result = null;
//        int maxAge = Integer.MIN_VALUE;
//        for (Trainer trainer : trainers) {
//            if (trainer.age() > maxAge) {
//                maxAge = trainer.age();
//                result = trainer;
//            }
//        }
//        return result;
    }
}
