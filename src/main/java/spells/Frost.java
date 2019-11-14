package spells;

public class Frost implements ISpell {

    private int damageValue;

    public Frost(){
        this.damageValue = 2;
    }

    public void cast(){
        System.out.println("Jack Frost! Damage " + this.damageValue);
    }

}
