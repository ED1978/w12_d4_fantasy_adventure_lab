package players;

public abstract class Player {

    private String name;
    private int health;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void receiveHealth(int amount){
        this.health += amount;
    }

    public void takeDamage(int amount){
        this.health -= amount;
    }


}
