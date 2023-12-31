package Model;

import java.util.Random;
public class Randomizer {



    private static Random random = new Random();

    public static int random(int bound) {
        int ran = random.nextInt(bound);
        if (ran < bound * 0.2)
            return 1;
        if (ran < bound * 0.4)
            return 2;
        return 3;
    }

}
