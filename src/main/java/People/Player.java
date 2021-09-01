package People;

import Enemy.Enemy;
import behaviours.IEquip;
import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;

public abstract class Player implements IEquip {

    public int health;
    private String hand;
    private ArrayList<Items>backpack;


    public Player(int health, String hand){
        this.health = health;
        this.hand = hand;
        this.backpack = new ArrayList<>();
    }

    public int attackEnemy(int healthAmount, Enemy enemy){

    }


    public void addItemsToBackpack(Items item){
        backpack.add(item);

    }

    public void equipObject(String object){
        this.hand = object;
    }

    public int getHealth() {
        return health;
    }
}
