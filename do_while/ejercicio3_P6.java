package proyecto;
import java.util.Scanner;
public class ejercicio3_P6 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();

	        int contador = 1;

	        do {
	            System.out.print(contador + " ");
	            contador++;
	        } while (contador <= numero);

	        System.out.println();
	    }
}
