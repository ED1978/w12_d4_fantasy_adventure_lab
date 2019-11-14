package spells;

import enemys.Enemy;

public class FireBall implements ISpell{

    private int damageValue;

    public FireBall(){
        this.damageValue = 10;
    }

    public void cast(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("KAABOOM! Damage " + this.damageValue);
    }

}
