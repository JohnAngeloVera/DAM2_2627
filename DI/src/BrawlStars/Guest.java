package BrawlStars;

public class Guest extends User{

    public Guest(String username, String password) {
        super(username, password);
    }

    @Override
    public void showUserMenu() {
        while (true) {
            System.out.println();
            System.out.println("1. Ver brawlers");
            System.out.println("2. Combatir");
            System.out.println("3. Cerrar sesión");
            System.out.println();

            int opcion = Main.option();
            System.out.println();

            if (opcion == 1) {
                Main.showBrawlers();
            } else if (opcion == 2) {
                Main.fight();
            } else if (opcion == 3) {
                System.out.println("Sesión cerrada.");
                return;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
