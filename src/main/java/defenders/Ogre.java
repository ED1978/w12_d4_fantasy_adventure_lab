package defenders;

public class Ogre implements IDefend {

    private int damageValue;

    public Ogre(){
        this. damageValue = 20;
    }

    public void defend(){
        System.out.println("OGRE SMAAAASH!! Damage " + this.damageValue);
    }

}
