package proyecto;
import java.util.Scanner;
public class ejercicio3_P3_D {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la nota (0-10): ");
	        double nota = scanner.nextDouble();

	        if (nota >= 6) {
	            System.out.println("¡Aprobaste!");
	        } else {
	            System.out.println("Reprobaste.");
	        }
	    }
}
