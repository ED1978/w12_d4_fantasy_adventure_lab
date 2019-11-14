package players.fighters;

import weapons.Sword;

public class Knight extends Fighter {

    public Knight(String name){
        super(name, 80);
        this.selectedWeapon = new Sword();
    }

}
