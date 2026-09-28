public class Legendario implements Brawler{
    private final String name;
    private int health;
    private final int damage=1000;

    public Legendario(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void tirarUlti() {
        System.out.printf("%s (%d vida, %d, legendario) tirando ulti...\n",this.name,this.health,this.damage);
    }

    @Override
    public void disparando() {
        System.out.printf("%s (%d vida, %d, legendario) disparando...\n",this.name,this.health,this.damage);
    }

    @Override
    public void recargando() {
        System.out.printf("%s (%d vida, %d, legendario) recargando...\n",this.name,this.health,this.damage);
    }
}
