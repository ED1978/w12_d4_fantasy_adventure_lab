package enemys;

import players.Player;
import weapons.Club;

public class Orc extends  Enemy {

    public Orc(String name){
        super(name, 75);
        this.selectedWeapon = new Club();
    }



}
