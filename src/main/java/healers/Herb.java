package healers;

public class Herb implements  IHeal {

    private int healValue;

    public Herb(){
        this.healValue = 10;
    }

    public void heal(){
        System.out.println("Ahh, herby goodness, that's better " + this.healValue);
    }

}
