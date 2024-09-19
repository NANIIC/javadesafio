import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;


        System.out.println("*****************");
        //voy a agregar una barra invertida + n para que no quede pegado a el primer print
        System.out.println("\nNombre del cliente: " + nombre );
        System.out.println("Su tipo de cuenta es: " + tipoCuenta);
        System.out.println("El Saldo es: $" + saldo);
        System.out.println("\n*****************"); // la \n da un salto de línea

        String menu = """
                *** Escriba el número de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        //Habilitamos entrada de teclado
        Scanner teclado = new Scanner (System.in);
        // != usamos eso para que rompa la repeticion
        while (opcion !=9){
            System.out.println(menu);
            //asignar a la opcionn de lo que va a ser recibido por teclado
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break; //rompemos para que no quede en ciclo infinito mostrando esta opc
                case 2:
                    System.out.println("Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    } else{
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cuál es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("Opción no válida");

            }


        }
    }

}
