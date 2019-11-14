package weapons;

import enemys.Enemy;

public class Axe implements  IWeapon {

    private int damageValue;

    public Axe(){
        this.damageValue = 10;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Axe Attack " + this.damageValue);
    }


}
