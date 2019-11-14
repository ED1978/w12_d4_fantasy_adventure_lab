package players.fighters;

import weapons.Axe;
import weapons.Club;

public class Barbarian extends Fighter {

    public Barbarian(String name){
        super(name, 100);
        this.selectedWeapon = new Club();
    }

}
