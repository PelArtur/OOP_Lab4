package lotr;

import java.util.Random;


public class CharacterFactory {

    public static Character createCharacter() {
        Random random = new Random();
        int randomCharacter = random.nextInt(4);
        switch (randomCharacter){
            case 0: return new Hobbit();
            case 1: return new Elf();
            case 2: return new King();
            case 3: return new Knight();
            default: return null;
        }
    }
}
