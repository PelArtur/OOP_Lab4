package lotr;

public class Hobbit extends Character {

    Hobbit(){
        super(0,3);
    }
    @Override
    public String toString(){
        return "Hobbit{hp=" + hp +
                ", power=" + pow +
                "}";
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    private void toCry(){
        System.out.println("Crying");
    }
}
