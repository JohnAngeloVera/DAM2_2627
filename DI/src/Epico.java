public class Epico implements Brawler {
    private final String name;
    private int health;
    private final int damage=1000;

    public Epico(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void tirarUlti() {
        System.out.printf("%s (%d vida, %d, epico) tirando ulti...\n",this.name,this.health,this.damage);
    }

    @Override
    public void disparando() {
        System.out.printf("%s (%d vida, %d, epico) disparando...\n",this.name,this.health,this.damage);
    }

    @Override
    public void recargando() {
        System.out.printf("%s (%d vida, %d, epico) recargando...\n",this.name,this.health,this.damage);
    }
}
