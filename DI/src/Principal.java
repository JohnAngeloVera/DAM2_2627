import java.util.ArrayList;

public class Principal {
    static ArrayList<Brawler> brawler;
    public static void main(String[] args) {
         brawler = new ArrayList<>();

         Legendario leon = new Legendario("Leon",9000);
         Legendario crow = new Legendario("Crow",7000);
         Mitico Byron = new Mitico("Byron",8500);
         Mitico Mortis = new Mitico("Mortis",10000);
         Epico Bo = new Epico("Bo",9500);
         Epico Ash = new Epico("Ash",15000);


        brawler.add(leon);
        brawler.add(crow);
        brawler.add(Byron);
        brawler.add(Mortis);
        brawler.add(Bo);
        brawler.add(Ash);

        for(Brawler brawlers: brawler){
            brawlers.disparando();
            brawlers.tirarUlti();
            brawlers.recargando();
            System.out.println();
        }
    }
}
