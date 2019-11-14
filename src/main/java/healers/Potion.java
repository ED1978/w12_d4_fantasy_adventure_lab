package healers;

import players.Player;

public class Potion implements IHeal {

    private int healValue;

    public Potion(){
        this.healValue = 15;
    }

    public void heal(Player player){
        player.receiveHealth(this.healValue);
        System.out.println("Yuck! disgusting, that's better " + this.healValue);
    }

}
