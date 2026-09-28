package BrawlStars;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Brawler> brawlers = new ArrayList<>();
    private static final ArrayList<User> users = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
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