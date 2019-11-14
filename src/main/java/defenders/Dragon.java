package defenders;

import enemys.Enemy;

public class Dragon implements IDefend {

    private int damageValue;

    public Dragon(){
        this.damageValue = 30;
    }

    public void defend(Enemy enemy){
        enemy.takeDamage(this.damageValue);
        System.out.println("Dragony ROOOAAARRR! Damage " + this.damageValue);
    }

}
