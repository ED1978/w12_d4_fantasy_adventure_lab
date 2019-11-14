package enemys;

public abstract class Enemy {

    private String name;
    private int health;

    public Enemy(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void takeDamage(int damageValue){
        this.health -= damageValue;
    }

}
