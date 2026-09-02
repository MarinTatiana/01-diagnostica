public class Ejercicio5 {

    // Definimos la función estática calcularPromedio(double a, double b)
    public static double calcularPromedio(double a, double b) {
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        // Probamos la función calcularPromedio
        double resultado = calcularPromedio(8.0, 9.0);
        System.out.println("Promedio: " + resultado);

        // Instanciamos la clase Estudiante y llamamos a su método mostrarFicha()
        Estudiante est = new Estudiante("Tatiana", 17);
        est.mostrarFicha();
    }
}

// Creamos la clase Estudiante con sus atributos, constructor y métodos
class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarFicha() {
        System.out.println("Nombre del estudiante: " + nombre + ", Edad: " + edad);
    }
}