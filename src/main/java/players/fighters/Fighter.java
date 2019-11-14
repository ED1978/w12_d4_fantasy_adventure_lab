package players.fighters;

import enemys.Enemy;
import players.Player;
import weapons.IWeapon;

public abstract class Fighter extends Player implements IWeapon {

    protected IWeapon selectedWeapon;

    public Fighter(String name, int health){
        super(name, health);
    }

    public void attack(Enemy enemy){
        selectedWeapon.attack(enemy);
    }

    public void attack(Player player){
        selectedWeapon.attack(player);
    }



}
