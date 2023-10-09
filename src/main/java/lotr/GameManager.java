package lotr;

public class GameManager {
    public void fight(Character c1, Character c2){
        if(c1 instanceof Hobbit && c2 instanceof Hobbit){
            System.out.println("Friendship win");
            return;
        }
        int round = 1;
        while(c1.isAlive() && c2.isAlive() && c1.getPow() > 0 && c2.getPow() > 0){
            System.out.println("Round " + round);
            System.out.println("Character 1 kick");
            c1.kick(c2);
            System.out.println("Character 2 kick");
            c2.kick(c1);
            round++;
        }

        if(c1.getPow() > 0 && c1.isAlive()){
            System.out.println("Character 1 win");
        } else if (c2.getPow() > 0 && c2.isAlive()) {
            System.out.println("Character 2 win");
        } else
        {
            System.out.println("Character 1 and Character 2 have no power to fight");
        }
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        gameManager.fight(c1, c2);
    }
}
