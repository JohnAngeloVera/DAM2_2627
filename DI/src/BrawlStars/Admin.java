package BrawlStars;

// Clase hija de USer
public class Admin extends User{

    //Constructor heredado del padre
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    //Sobreescribo el metodo abstracto para este caso en el que el usuario sea admin
    public void showUserMenu() {
        while (true) {
            //Menu a mostrar si te conectas como admin
            System.out.println();
            System.out.println("1. Ver brawlers");
            System.out.println("2. Crear brawler legendario");
            System.out.println("3. Crear brawler épico");
            System.out.println("4. Cerrar sesión");
            System.out.println();

            int opcion = Main.option();
            System.out.println();

            if (opcion == 1) {
                Main.showBrawlers();//Enseña los brawlers y teniendo en cuenta el hecho que pueda no haber ninguno aun

            }//Opciones de creacion de Brawlers con un atributo diferenciador (legendario:daño y epico:suplemento de vida)
            else if (opcion == 2) {
                Main.createLegend();
            } else if (opcion == 3) {
                Main.createEpic();
            } else if (opcion == 4) {

                // Gestiona las otras opciones posibles
                System.out.println("Sesión cerrada.");
                return;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
