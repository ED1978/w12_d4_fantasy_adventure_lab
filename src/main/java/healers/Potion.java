package healers;

public class Potion implements IHeal {

    private int healValue;

    public Potion(){
        this.healValue = 15;
    }

    public void heal(){
        System.out.println("Yuck! disgusting, that's better " + this.healValue);
    }

}
