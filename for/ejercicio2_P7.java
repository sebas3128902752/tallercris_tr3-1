package proyecto;
import java.util.Scanner;
public class ejercicio2_P7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }
}
