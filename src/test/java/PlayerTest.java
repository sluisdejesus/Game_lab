import Items.Weapon;
import People.Melee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Melee melee;
    Weapon weapon;

    @Before
    public void before(){
        melee = new Melee(100,"hand");
        weapon = new Weapon("Axe", 20, 10);
    }

    @Test
    public void canAddWeaponToBackpack(){
        melee.addItemsToBackpack(weapon);
        assertEquals(1, melee.getBackpack().size());
    }

}
