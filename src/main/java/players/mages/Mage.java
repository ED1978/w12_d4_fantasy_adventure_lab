package players.mages;

import defenders.IDefend;
import players.Player;
import spells.ISpell;

public abstract class Mage extends Player implements ISpell, IDefend {

    protected ISpell selectedSpell;
    protected IDefend selectedDefense;

    public Mage(String name, int health){
        super(name, health);
    }

    public void cast(){
        this.selectedSpell.cast();
    }

    public void defend(){
        this.selectedDefense.defend();
    }

}
