package behaviours;

import Enemy.Enemy;
import People.Player;

public interface IAttack {
    public void attackEnemy(int healthAmount, Enemy enemy);
    public void attackPlayer(int healthAmount, Player player);
}
