package players.mages;

import defenders.Dragon;
import spells.FireBall;

public class Wizard extends Mage {

    public Wizard(String name){
        super(name, 25);
        this.selectedSpell = new FireBall();
        this.selectedDefense = new Dragon();
    }
}
