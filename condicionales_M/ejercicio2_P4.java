package proyecto;
import java.util.Scanner;
public class ejercicio2_P4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número de mes (1-12): ");
	        int mes = scanner.nextInt();

	        String nombreMes;

	        switch (mes) {
	            case 1:
	                nombreMes = "Enero";
	                break;
	            case 2:
	                nombreMes = "Febrero";
	                break;
	            case 3:
	            	nombreMes ="marzo";
	            	break;
	            case 4:
	            	nombreMes ="abril";
	            	break;
	            case 5:
	            	nombreMes ="mayo";
	            	break;
	            case 6:
	            	nombreMes ="junio";
	            	break;
	            case 7:
	            	nombreMes ="julio";
	            	break;
	            case 8:
	            	nombreMes ="agosto";
	            	break;
	            case 9:
	            	nombreMes ="septiembre";
	            	break;
	            case 10:
	            	nombreMes ="octubre";
	            	break;
	            case 11:
	            	nombreMes ="noviembre";
	            	break;
	            case 12:
	            	nombreMes ="diciembre";
	            	break;
	            default:
	                nombreMes = "Mes inválido";
	        }

	        System.out.println("El mes es: " + nombreMes);
	    }
}
