import java.util.Scanner;

public class Calculadora {
    static Scanner scanner = new Scanner(System.in);

    public static int leerInt(String mensaje){
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    public static int opcion(){
        return leerInt("OPCIÓN: ");
    }

    public static void main(String[] args) {

    }
}
