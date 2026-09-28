package BrawlStars;

// Clase hija de Brawler
public class Legendary extends Brawler {

    //Variable que solo tienen los legendarios
    private int damage;

    //Constructor aprovechando el del padre con super + la variable especial de legendario
    public Legendary(String name, int health, int damage) {
        super(name, health);
        this.damage = damage;
    }

    @Override
    // Sobreescribo la clase abstracta ajustandola a esta clase hija la cual ataca al enemigo segun daño tenga
    public void actionByCategory(Brawler enemy) {
        enemy.reduceHealth(damage);
        System.out.println(this + " Apply -" + damage + " damage to " + enemy.getName());
    }
}
