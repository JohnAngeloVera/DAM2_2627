package BrawlStars;

public class Admin extends User{
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showUserMenu() {
        while (true) {
            System.out.println();
            System.out.println("1. Ver brawlers");
            System.out.println("2. Crear brawler legendario");
            System.out.println("3. Crear brawler épico");
            System.out.println("4. Cerrar sesión");
            System.out.println();

            int opcion = Main.option();
            System.out.println();

            if (opcion == 1) {
                Main.showBrawlers();
            } else if (opcion == 2) {
                Main.createLegend();
            } else if (opcion == 3) {
                Main.createEpic();
            } else if (opcion == 4) {
                System.out.println("Sesión cerrada.");
                return;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
