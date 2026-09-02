import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Instanciamos el Scanner para leer la edad
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();

        // Evaluamos con if / else si es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        scanner.close();
    }
}