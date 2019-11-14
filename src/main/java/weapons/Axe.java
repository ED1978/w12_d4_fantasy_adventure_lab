package weapons;

public class Axe implements  IWeapon {

    private int damageValue;

    public Axe(){
        this.damageValue = 10;
    }

    public void attack(){
        System.out.println("Axe Attack " + this.damageValue);
    }


}
