public class Mitico implements Brawler{
    private final String name;
    private int health;
    private final int damage=800;

    public Mitico(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void tirarUlti() {
        System.out.printf("%s (%d vida, %d, mitico) tirando ulti...\n",this.name,this.health,this.damage);
    }

    @Override
    public void disparando() {
        System.out.printf("%s (%d vida, %d, mitico) disparando...\n",this.name,this.health,this.damage);
    }

    @Override
    public void recargando() {
        System.out.printf("%s (%d vida, %d, mitico) recargando...\n",this.name,this.health,this.damage);
    }
}
