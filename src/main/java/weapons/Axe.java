package weapons;

import enemys.Enemy;
import players.Player;

public class Axe implements  IWeapon {

    private int damageValue;

    public Axe(){
        this.damageValue = 10;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Axe Attack " + this.damageValue);
    }

    public void attack(Player player){
        player.takeDamage(this.damageValue);
        System.out.println("Club Attack " + this.damageValue);
    }


}
