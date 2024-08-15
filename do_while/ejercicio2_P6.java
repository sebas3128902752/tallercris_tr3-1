package proyecto;
import java.util.Scanner;
public class ejercicio2_P6 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.print("Ingrese un número  positivo: ");
	            numero = scanner.nextInt();
	            if (numero <= 0) {
	                System.out.println("El número debe ser positivo.");
	            }
	        } while (numero <= 0);

	        System.out.println("Gracias por ingresar un número positivo: " + numero);
	    }
}
