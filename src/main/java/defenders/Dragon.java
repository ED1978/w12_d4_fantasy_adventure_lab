package defenders;

public class Dragon implements IDefend {

    private int damageValue;

    public Dragon(){
        this.damageValue = 30;
    }

    public void defend(){
        System.out.println("Dragony ROOOAAARRR! Damage " + this.damageValue);
    }

}
