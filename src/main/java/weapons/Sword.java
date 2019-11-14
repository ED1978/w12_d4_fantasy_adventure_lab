package weapons;

import enemys.Enemy;
import players.Player;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(){
        this.damageValue = 5;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Sword Attack " + this.damageValue);
    }

    public void attack(Player player){
        player.takeDamage(this.damageValue);
        System.out.println("Club Attack " + this.damageValue);
    }

}
