package spells;

import enemys.Enemy;

public class Frost implements ISpell {

    private int damageValue;

    public Frost(){
        this.damageValue = 2;
    }

    public void cast(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Jack Frost! Damage " + this.damageValue);
    }

}
