package healers;

import players.Player;

public class Herb implements  IHeal {

    private int healValue;

    public Herb(){
        this.healValue = 10;
    }

    public void heal(Player player){
        player.receiveHealth(this.healValue);
        System.out.println("Ahh, herby goodness, that's better " + this.healValue);
    }

}
