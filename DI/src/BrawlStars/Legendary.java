package BrawlStars;

public class Legendary extends Brawler {
    private int damage;

    public Legendary(String name, int health, int damage) {
        super(name, health);
        this.damage = damage;
    }

    @Override
    public void actionByCategory(Brawler enemy) {
        enemy.reduceHealth(damage);
        System.out.println(this + " Apply -" + damage + " damage to " + enemy.getName());
    }
}
