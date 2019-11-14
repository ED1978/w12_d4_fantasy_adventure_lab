package players.mages;

import defenders.IDefend;
import enemys.Enemy;
import players.Player;
import spells.ISpell;

public abstract class Mage extends Player implements ISpell, IDefend {

    protected ISpell selectedSpell;
    protected IDefend selectedDefense;

    public Mage(String name, int health){
        super(name, health);
    }

    public void cast(Enemy enemy){
        this.selectedSpell.cast(enemy);
    }

    public void defend(Enemy enemy){
        this.selectedDefense.defend(enemy);
    }

}
