package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@AllArgsConstructor @Getter
public abstract class Character {
    @Setter
    int pow;
    int hp;

    public abstract void kick(Character c);
    public boolean isAlive(){
        return getHp() > 0;
    }

    public void setHp(int hp){
        this.hp = Math.max(hp, 0);
    }
    public void setHp(){this.hp = 0;}

    public void kill(Character c){
        c.setHp(0);
    }
}
