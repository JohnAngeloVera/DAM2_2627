package BrawlStars;

public class Brawler {
    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Brawler(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void increaseHealth(int supply){
        this.health+=supply;
    }
    public void reduceHealth(int damage){
        this.health-=damage;
    }
}
