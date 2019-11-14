package spells;

public class Ice implements ISpell {

    private int damageValue;

    public Ice(){
        this.damageValue = 7;
    }

    public void cast(){
        System.out.println("Baltic bytheway! Damage ice" + this.damageValue);
    }

}
