package lotr;

import static lotr.Randomiser.randomValue;

public class King extends Character{
    King(){super(randomValue(5, 15), randomValue(5,15));}
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp()-pow);
    }

}

