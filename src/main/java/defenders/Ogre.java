package defenders;

import enemys.Enemy;

public class Ogre implements IDefend {

    private int damageValue;

    public Ogre(){
        this. damageValue = 20;
    }

    public void defend(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("OGRE SMAAAASH!! Damage " + this.damageValue);
    }

}
