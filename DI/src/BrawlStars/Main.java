package BrawlStars;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Brawler> brawlers = new ArrayList<>();
    private static final ArrayList<User> users = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        users.add(new Admin("admin", "admin123"));
        users.add(new Guest("guest", "guest123"));
        while (true) {
            showAccessMenu();
            int opcion = option();
            System.out.println();

            if (opcion == 1) {
                User user = login();

                if (user == null) {
                    System.out.println("Usuario o contraseña incorrectos.");
                } else {
                    user.showUserMenu();
                }

            } else if (opcion == 2) {
                break;

            } else {
                System.out.println("Opcion no valida");
            }

            System.out.println();
        }
    }
}
private static void showAccessMenu() {
    System.out.println("1. Iniciar sesión");
    System.out.println("2. Salir");
    System.out.println();
}

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
public static void showBrawlers() {
    if (brawlers.isEmpty()) {
        System.out.println("Todavía no hay brawlers creados...");
    } else {
        for (Brawler brawler : brawlers) {
            System.out.println(brawler);
        }
    }
}
public static void createLegend() {
    String name = readName("Nombre: ");
    int health = readInt("Vida: ");
    int damage = readInt("Daño: ");

    brawlers.add(new Legendary(name, health, damage));
}

public static void createEpic() {
    String name = readName("Nombre: ");
    int health = readInt("Vida: ");
    int supply = readInt("Suministros: ");

    brawlers.add(new Epic(name, health, supply));
}
private static Brawler searchBrawler(String name) {
    for (Brawler brawler : brawlers) {
        if (brawler.getName().equals(name)) {
            return brawler;
        }
    }

    return null;
}

public static void fight() {
    String name1 = readName("Nombre del brawler 1: ");
    String name2 = readName("Nombre del brawler 2: ");

    Brawler brawler1 = searchBrawler(name1);
    Brawler brawler2 = searchBrawler(name2);

    if (brawler1 == null || brawler2 == null) {
        System.out.println("Uno de los brawlers no se ha encontrado...");
        return;
    }

    System.out.println(brawler1);
    System.out.println(brawler2);
    System.out.println();

    brawler1.actionByCategory(brawler2);
    System.out.println(brawler2);
    System.out.println();

    brawler2.actionByCategory(brawler1);
    System.out.println(brawler1);
}
