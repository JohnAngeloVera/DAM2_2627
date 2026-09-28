package BrawlStars;

// Clase hija de user
public class Guest extends User{

    //Constructor heredado de user
    public Guest(String username, String password) {
        super(username, password);
    }

    @Override
    //Sobreescribo el metodo abstracto para este caso en el que el usuario sea invitado
    public void showUserMenu() {
        while (true) {
            //Menu a mostrar si te conectas como invitado
            System.out.println();
            System.out.println("1. Ver brawlers");
            System.out.println("2. Combatir");
            System.out.println("3. Cerrar sesión");
            System.out.println();

            int opcion = Main.option();
            System.out.println();

            if (opcion == 1) {
                Main.showBrawlers();//Muestra los brawler que tengas
            } else if (opcion == 2) {
                Main.fight();//crea una interaccion de pelea entre dos brawlers que ya tengamos diferenciando segun que clase sea
            } else if (opcion == 3) {
                // Gestiona las otras opciones posibles
                System.out.println("Sesión cerrada.");
                return;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
