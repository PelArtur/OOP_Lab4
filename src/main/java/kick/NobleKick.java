package kick;

import java.util.Random;
import lotr.Character;
public class NobleKick implements KickStrategy{
    private static Random randomGenerator = new Random();
    @Override
    public void kick(Character whoKick, Character opponent) {
        opponent.setHp(opponent.getHp() - randomGenerator.nextInt(whoKick.getPow()));
    }
}
