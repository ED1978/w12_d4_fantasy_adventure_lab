package spells;

public class FireBall implements ISpell{

    private int damageValue;

    public FireBall(){
        this.damageValue = 10;
    }

    public void cast(){
        System.out.println("KAABOOM! Damage " + this.damageValue);
    }

}
