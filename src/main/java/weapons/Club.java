package weapons;

import enemys.Enemy;

public class Club implements  IWeapon {

    private int damageValue;

    public Club(){
        this.damageValue = 5;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Club Attack " + this.damageValue);
    }



}
