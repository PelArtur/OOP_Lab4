package lotr;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if(getPow() > c.getPow()){
            kill(c);
        }
        else{
            if(c.getPow() > 0){
                c.setPow(c.getPow()-1);
            }
        }
    }
}
