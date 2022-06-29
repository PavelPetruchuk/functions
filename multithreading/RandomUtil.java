package multithreading;

import java.util.Random;

public final class  RandomUtil {
    private static final Random RANDOM = new Random();
    private static final int MIN = 2;

    private RandomUtil() {
    }

    public static int getRandomMax(int bound) {
        return RANDOM.nextInt(bound) + MIN;
    }

    public static int getNext(int bound) {
        return RANDOM.nextInt(bound + 1);
    }
}
