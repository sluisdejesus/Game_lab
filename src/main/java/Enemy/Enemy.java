package Enemy;

import People.Player;
import behaviours.IAttack;

public class Enemy implements IAttack {

    private int health;

    public Enemy(int health){
        this.health = health;
    }

//    public int attackPlayer(int healthAmount, Player player){
//
//    }

}
