import java.util.Scanner;

public class Alumnos {
    // Aqui se agregan los atributos tipo String y array
    private String nombre;
    private double[] calificaciones;

    // Aqui esta el constructor
    public Alumnos(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Metodo para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.length;
    }

    // Metodo para la calificacion final
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

    // Metodo de impresion de los resultados
    public void imprimirResultados(double promedio, char calificacionFinal) {
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación final: " + calificacionFinal);
    }

    // Metodo para pedir agregar el nombre del alumno participante e ingresar las calificaciones
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();

        double[] calificaciones = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        // Este es para crear el objeto alumno
        Alumnos alumno = new Alumnos(nombre, calificaciones);

        // Este es para calcular y mostrar resultados
        double promedio = alumno.calcularPromedio();
        char calificacion = alumno.obtenerCalificacionFinal(promedio);
        alumno.imprimirResultados(promedio, calificacion);

        scanner.close();
    }
}
