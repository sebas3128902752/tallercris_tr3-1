package proyecto;
import java.util.Scanner;
public class ejercicio2_P3_S {
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);

	   System.out.print("Ingrese   su edad: ");
	   int edad = scanner.nextInt();

	   if (edad >= 18) {
	       System.out.println("Eres mayor de edad.");
	   }
	}
}
