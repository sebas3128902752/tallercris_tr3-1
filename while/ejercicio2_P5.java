package proyecto;
import java.util.Scanner;
public class ejercicio2_P5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
	        int numero = scanner.nextInt();

	        int multiplicador = 1;

	        while (multiplicador <= 10) {
	            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
	            multiplicador++;
	        }
	    }

}
