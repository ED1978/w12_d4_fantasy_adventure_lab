package weapons;

public class Club implements  IWeapon {

    private int damageValue;

    public Club(){
        this.damageValue = 3;
    }

    public void attack(){
        System.out.println("Club Attack " + this.damageValue);
    }



}
