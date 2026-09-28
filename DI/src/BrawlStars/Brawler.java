package BrawlStars;
//Clase abstracta necesaria si quieres tener metodos abstractos
public abstract class Brawler {

    //Variables que heredaran las clases hijas
    private String name;
    private int health;

    //Getters y Setters
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

    //Constructor Necesario para iniciar el objeto
    public Brawler(String name, int health) {
        this.name = name;
        this.health = health;
    }

    //Funcion que en el caso de ser epico se cure asimismo la cantidad de supply
    public void increaseHealth(int supply){
        this.health+=supply;
    }

    //Funcion que reduce la vida del enemigo segun el daño del brawler
    public void reduceHealth(int damage){
        this.health-=damage;
    }
    @Override
    //Funcion to String cambiada para modificar el como se vera cuando imprimo la clase en si(muy facilitador en este caso)
    public String toString() {
        return "[" + name + ":" + health + "]";
    }

    //Metodo abstracto que variara segun la clase hija , de hay la necesidad de que sea abstract
    public abstract void actionByCategory(Brawler enemy);
}
