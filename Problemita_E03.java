package Pg1;
import java.util.Scanner;

public class Problemita_E03 {
    static public void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese numero 1: ");
        double num1 = teclado.nextDouble();
        
        System.out.print("Ingrese numero 2: ");
        double num2 = teclado.nextDouble();
        
        System.out.println("Seleccione una operacion:");
        System.out.println("1 = suma");
        System.out.println("2 = resta");
        System.out.println("3 = multiplicacion");
        System.out.println("4 = division");
        System.out.print("Opcion: ");

        int operacion = teclado.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("El resultado de la división es: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción no válida");
            teclado.close();
} 
}
}