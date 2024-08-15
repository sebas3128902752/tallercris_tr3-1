package proyecto;
import java.util.Scanner;
public class ejercicio3_P4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota (0-10): ");
        double nota = scanner.nextDouble();

        char calificacion;

        if (nota >= 9) {
            calificacion = 'A';
        } else if (nota >= 8) {
            calificacion = 'B';
        } else if (nota >= 7) {
            calificacion = 'C';
        } else if (nota >= 6) {
            calificacion = 'D';
        } else {
            calificacion = 'F';
        }

        System.out.println("La calificación es: " + calificacion);
    }
}
