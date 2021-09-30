package People;
import behaviours.IEquip;



public class Melee extends Player implements IEquip {

    public Melee(int health, String hand){
        super(health, hand);
    }

    public void equipObject(String object){
        this.hand = object;
    }


}


