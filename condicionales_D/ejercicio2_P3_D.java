package proyecto;
import java.util.Scanner;
public class ejercicio2_P3_D {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println(numero + " es par.");
	        } else {
	            System.out.println(numero + " es impar.");
	        }
	    }
}
