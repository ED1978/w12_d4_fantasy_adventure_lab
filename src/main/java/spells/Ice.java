package spells;

import enemys.Enemy;

public class Ice implements ISpell {

    private int damageValue;

    public Ice(){
        this.damageValue = 7;
    }

    public void cast(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Baltic bytheway! Damage ice" + this.damageValue);
    }

}
