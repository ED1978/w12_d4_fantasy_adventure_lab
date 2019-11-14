package weapons;

import enemys.Enemy;
import players.Player;

public interface IWeapon {

    public void attack(Enemy enemy);

    public void attack(Player player);
}
