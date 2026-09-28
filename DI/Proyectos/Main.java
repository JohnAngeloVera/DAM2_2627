import java.util.ArrayList;

public class Main {
    static ArrayList<Arma> armas;

    public static void main(String[] args) {
        Arma pistola = new Pistola();
        Arma fusil = new Fusil();

        armas = new ArrayList<>();
        armas.add(pistola);
        armas.add(fusil);

        for(Arma arma : armas){
            arma.disparar();
        }
    }
}
