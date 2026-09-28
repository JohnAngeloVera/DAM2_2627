package BrawlStars;

// Clase hija de Brawler
public class Epic extends Brawler{

    //Variable especial de epico y qeu diferencia
    private int supply;

    //Constructor aprovechando el del padre con super + la variable especial de epico
    public Epic(String name, int health, int supply) {
        super(name, health);
        this.supply = supply;
    }

    @Override
    // Sobreescribo la clase abstracta ajustandola a esta clase hija la cual cura al brawler la cantidad de supply
    public void actionByCategory(Brawler enemy) {
        increaseHealth(supply);
        System.out.println(this + " Increase health to " + getHealth());
    }
}
