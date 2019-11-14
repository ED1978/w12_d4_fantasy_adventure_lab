package players.fighters;

import players.Player;
import weapons.IWeapon;

public abstract class Fighter extends Player implements IWeapon {

    protected IWeapon selectedWeapon;

    public Fighter(String name, int health){
        super(name, health);
    }

    public void attack(){
        selectedWeapon.attack();
    }

}
