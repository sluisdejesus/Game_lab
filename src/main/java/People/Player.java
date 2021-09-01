package People;

import behaviours.IEquip;
import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;

public abstract class Player implements IEquip {

    private int health;
    private String hand;
    private ArrayList<Items>backpack;


    public Player(int health, String hand){
        this.health = health;
        this.hand = hand;
        this.backpack = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }

    public void addItemsToBackpack(Items item){
        backpack.add(item);

    }

    public void equipObject(String object){
        this.hand = object;
    }
}
