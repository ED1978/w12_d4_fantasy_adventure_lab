package weapons;

import enemys.Enemy;
import players.Player;

public class Club implements  IWeapon {

    private int damageValue;

    public Club(){
        this.damageValue = 5;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Club Attack " + this.damageValue);
    }

    public void attack(Player player){
        player.takeDamage(this.damageValue);
        System.out.println("Club Attack " + this.damageValue);
    }



}
