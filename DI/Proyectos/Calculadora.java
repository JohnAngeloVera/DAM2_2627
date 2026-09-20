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
        String menu = """
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                """;
        int opcion = 0;
        int resultado;

        System.out.print(menu);

        while (opcion!=5){
            opcion = opcion();
            if(opcion==5)break;
            else if (opcion >= 1 && opcion <= 4) {

            }else System.out.println("Opcion no valida");
            System.out.println();
        }

    }
}
