import java.util.Scanner;

public class Calculadora {

    //Inicializo Scanner
    static Scanner scanner = new Scanner(System.in);

    //Funcion que se usara para leer los distintos numeros a calcular
    public static int leerInt(String mensaje){
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    //Funcion que leera directamente la opcion elegida
    public static int opcion(){
        return leerInt("OPCIÓN: ");
    }

    public static void main(String[] args) {

        //Creo un menu con un unico String
        String menu = """ 
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Salir
                """;

        //Variables que se usaran en el codigo
        int opcion = 0;
        int resultado;

        //Imprimimos el menu
        System.out.print(menu);

        //Bucle que se mantendra mientras la opcion sea distinta a 5
        while (opcion!=5){
            opcion = opcion();

            //Si la opcion es = 5 se sale y termina
            if(opcion==5)break;

            //Este else if gestiona todas las opciones de operaciones
            else if (opcion >= 1 && opcion <= 4) {
                System.out.println();//Ajuste visual en ejecucion

                // Se pone aqui ya que solo quiero que te pida numero si esta entre la opcion 1  y 4 ambas incluidas
                int num1= leerInt("NÚMERO 1: ");
                int num2= leerInt("NÚMERO 2: ");

                //Variable que varia segun opcion
                String simbolo="";

                if(opcion==1){//Opcion de suma
                    resultado=num1+num2;
                    simbolo = "+";
                }else if (opcion==2) {//Opcion de resta
                    resultado=num1-num2;
                    simbolo = "-";
                }else if (opcion==3){//Opcion de multiplicacion con un bucle que obtiene el resultado mediante sumas y que permite un resultado negativo
                    resultado=0;
                    simbolo = "*";
                    for (int i = 0; i < Math.abs(num2); i++)resultado+=num1;
                    if(num2<0)resultado=-resultado;
                }else{//Opcion de Division teniendo en cuenta que si el denominador es 0 no se pueda y te pida otro numero hasta que se cambie
                    simbolo = "/";
                    while (num2 == 0) {
                        System.out.println("No se puede dividir entre 0.");
                        num2 = leerInt("NÚMERO 2: ");
                    }
                    resultado = num1 / num2;
                }

                // Muestra los numeros, simbolo y resultado con un solo printf gracias a la variable simbolo
                System.out.printf("%d %s %d = %d\n",num1,simbolo,num2,resultado);

                //Gestiono cualquier numero que no este entre las opciones
            }else System.out.println("Opcion no valida");

            System.out.println();//Ajuste visual en ejecucion
        }

    }
}
