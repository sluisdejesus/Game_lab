package People;
import behaviours.IEquip;
import Items.Item;

import java.util.ArrayList;

public abstract class Player implements IEquip {

    public int health;
    public String hand;
    private ArrayList<Item>backpack;


    public Player(int health, String hand){
        this.health = health;
        this.hand = hand;
        this.backpack = new ArrayList<>();
    }
    public void addItemsToBackpack(Item item){
        backpack.add(item);
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }

    public void equipObject(String object){
        this.hand = object;
    }

    public int getHealth() {
        return health;
    }
}
