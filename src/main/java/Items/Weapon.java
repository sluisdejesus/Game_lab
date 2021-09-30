package Items;

public class Weapon extends Item {

   private int damage;

    public Weapon(String name, int amount, int damage){
        super(name, amount);
        this.damage = damage;
    }


}
