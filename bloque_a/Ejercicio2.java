import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Instanciamos la clase Scanner para leer desde la consola
        Scanner scanner = new Scanner(System.in);

        // Leemos los dos números por teclado
        System.out.println("Ingresa el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingresa el segundo número:");
        double num2 = scanner.nextDouble();

        // Calculamos las operaciones básicas
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        
        // Mostramos los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir entre cero.");
        }

        scanner.close();
    }
}