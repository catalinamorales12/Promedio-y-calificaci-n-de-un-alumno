import java.util.Scanner;

public class Alumnos {
    // Aquí están los atributos tipo String y tipo array
    private String nombre;
    private double[] calificaciones;

    // Constructor que recibe el nombre y las calificaciones
    public Alumnos(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Metodo que calcula el promedio de las 5 calificaciones
    public double calcularPromedio() {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.length;
    }

    // Medoto para obtener la calificación final con letra
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Metodo que imprime los resultados y el nombre
    public void imprimirResultados(String nombre, double promedio, char calificacionFinal) {
        System.out.println("\n--- Resultados ---");
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación final: " + calificacionFinal);
    }

    // Metodo que almacena los 5 valores para poder ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();

        double[] calificaciones = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        // Crear objeto Alumnos
        Alumnos alumno = new Alumnos(nombre, calificaciones);

        // Calcular y mostrar resultados
        double promedio = alumno.calcularPromedio();
        char calificacion = alumno.obtenerCalificacionFinal(promedio);
        alumno.imprimirResultados(nombre, promedio, calificacion);

        scanner.close();
    }
}

