package players.clerics;

import healers.IHeal;
import healers.Potion;
import players.Player;

public class Cleric extends Player implements IHeal {

    private IHeal selectedRemedy;

    public Cleric(String name){
        super(name, 30);
        this.selectedRemedy = new Potion();
    }

    public void heal(){
        this.selectedRemedy.heal();
    }
}
