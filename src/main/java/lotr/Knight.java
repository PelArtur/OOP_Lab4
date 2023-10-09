package lotr;

import static lotr.Randomiser.randomValue;

public class Knight extends Character{
    Knight(){super(randomValue(2, 12), randomValue(2,12));}
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp()-pow);
    }

}
