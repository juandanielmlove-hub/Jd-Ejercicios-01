package Pg1;
import java.util.Scanner;

public class Problemita_E04 {
    static public void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double saldo = 1000;
        int opcion = 0;

              while (opcion != 4) {
            System.out.println("\nCAJERO AUTOMÁTICO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = teclado.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = teclado.nextDouble();
                    if (retiro <= saldo) {
                        saldo = saldo - retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes. Su saldo es: $" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automatico. Hasta luego UwU");
                    break;
                default:
                    System.out.println("OpciOn no valida");
                    teclado.close();
}            
}
}
}