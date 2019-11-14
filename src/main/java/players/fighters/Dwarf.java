package players.fighters;

import weapons.Axe;
import weapons.Club;

public class Dwarf extends Fighter {

    public Dwarf(String name){
        super(name, 60);
        this.selectedWeapon = new Axe();
    }

}
