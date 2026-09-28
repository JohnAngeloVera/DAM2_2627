package BrawlStars;

public class Epic extends Brawler{
    private int supply;

    public Epic(String name, int health, int supply) {
        super(name, health);
        this.supply = supply;
    }

    @Override
    public void actionByCategory(Brawler enemy) {

    }
}
