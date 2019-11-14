package players.mages;

import defenders.Ogre;
import spells.Ice;

public class Warlock extends Mage {

    public Warlock(String name){
        super(name, 40);
        this.selectedSpell = new Ice();
        this.selectedDefense =new Ogre();
    }

}
