package weapons;

import enemys.Enemy;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(){
        this.damageValue = 5;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Sword Attack " + this.damageValue);
    }

}
