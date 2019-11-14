package enemys;

import players.Player;
import weapons.IWeapon;

public abstract class Enemy implements IWeapon {

    private String name;
    private int health;
    protected IWeapon selectedWeapon;

    public Enemy(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void takeDamage(int damageValue){
        this.health -= damageValue;
    }

    public void attack(Player player){
        selectedWeapon.attack(player);
    }

    public void attack(Enemy enemy){
        selectedWeapon.attack(enemy);
    }


}
