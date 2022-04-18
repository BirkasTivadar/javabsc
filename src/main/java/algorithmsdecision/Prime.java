package algorithmsdecision;

import java.util.stream.IntStream;

public class Prime {
    public boolean isPrime(int num) {
        if (num < 2) return false;
        if (num % 2 == 0 && num != 2) return false;
//        return IntStream.iterate(3, i -> i + 2).limit(num / 4).noneMatch(i -> num % i == 0);
        int max = num / 2;
        return IntStream.range(3, max).noneMatch(i -> num % i == 0);
//        for (int i = 3; i < num / 2; i = i + 2) {
//            if (num % i == 0) return false;
//        }
//        return true;
    }
}
