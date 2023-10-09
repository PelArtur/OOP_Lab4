package lotr;

import java.util.Random;

public class Randomiser {
    public static int randomValue(int start, int end){
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }
}
