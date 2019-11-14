package weapons;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(){
        this.damageValue = 5;
    }

    public void attack(){
        System.out.println("Sword Attack " + this.damageValue);
    }

}
