package BrawlStars;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Inicio los array de clases que voy a utilizar y el scanner para leer resultados
    private static final ArrayList<Brawler> brawlers = new ArrayList<>();
    private static final ArrayList<User> users = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Creo los usuarios con roles distintos (Admin y Guest)
        users.add(new Admin("admin", "admin123"));
        users.add(new Guest("guest", "guest123"));
        while (true) {
            showAccessMenu();//Menu inicial
            int opcion = option();
            System.out.println();

            if (opcion == 1) {
                User user = login();//Funcion que checkea si los datos coinciden con alguno de los usuarios guardados

                //gestiona los casos en los que no
                if (user == null) {
                    System.out.println("Usuario o contraseña incorrectos.");
                } else {

                    // si esta bien llamo al metodo abstracto que varia el menu segun sea admin o invitado el login
                    user.showUserMenu();
                }

            } else if (opcion == 2) {

                // Gestionamos otras opciones posibles
                break;

            } else {
                System.out.println("Opcion no valida");
            }

            System.out.println();
        }
    }

    // Menu inicia de inicio de sesion o salida del programa
    private static void showAccessMenu() {
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Salir");
        System.out.println();
    }

    // Funcion que controla que los datos en el login sean correctos y coincidan con algun usuario
    private static User login() {
        String username = readName("Usuario: ");
        String password = readName("Contraseña: ");

        for (User user : users) {
            if (user.matches(username, password)) {
                return user;
            }
        }

        return null;
    }

    //Funciones de Lectura repetitivas que creamos para una mayor limpieza del mismo
    public static int option() {
        return readInt("OPCION: ");
    }

    public static int readInt(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static String readName(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    //Funcion que te muestra todos los brawlers contenidos en el arraylist de brawlers
    public static void showBrawlers() {
        if (brawlers.isEmpty()) {

            // Teniendo en cuenta el caso de que aun no haya ninguno
            System.out.println("Todavía no hay brawlers creados...");
        } else {
            for (Brawler brawler : brawlers) {
                System.out.println(brawler);
            }
        }
    }

    //Funcion de creacion de Clases hijas legendario y epico con sus atributos especiales correspondientes
    public static void createLegend() {
        String name = readName("Nombre: ");
        int health = readInt("Vida: ");
        int damage = readInt("Daño: ");

        //y finalente se lo añade al arraylist
        brawlers.add(new Legendary(name, health, damage));
    }

    public static void createEpic() {
        String name = readName("Nombre: ");
        int health = readInt("Vida: ");
        int supply = readInt("Suministros: ");

        brawlers.add(new Epic(name, health, supply));
    }

    //Funcion que busca si tengo algun brawler con el nombre dado en el parametro
    private static Brawler searchBrawler(String name) {
        for (Brawler brawler : brawlers) {
            if (brawler.getName().equals(name)) {
                return brawler;
            }
        }

        //Contempla la opcion que no coincida ninguno
        return null;
    }

    //Funcion principal de la interaccion de lucha
    public static void fight() {

        //lee los brawlers que quieres que peleen
        String name1 = readName("Nombre del brawler 1: ");
        String name2 = readName("Nombre del brawler 2: ");

        //Se busca si tenemos las opciones dadas creadas
        Brawler brawler1 = searchBrawler(name1);
        Brawler brawler2 = searchBrawler(name2);

        //Si no lo tenemos se menciona y vuelve para atras
        if (brawler1 == null || brawler2 == null) {
            System.out.println("Uno de los brawlers no se ha encontrado...");
            return;
        }


        // si lo tenemos te los muestra
        System.out.println(brawler1);
        System.out.println(brawler2);
        System.out.println();

        // Y interaccciona su funcion abstracta que varia segun el brawler sea epico o legendario
        brawler1.actionByCategory(brawler2);
        System.out.println(brawler2);
        System.out.println();

        brawler2.actionByCategory(brawler1);
        System.out.println(brawler1);
    }

}