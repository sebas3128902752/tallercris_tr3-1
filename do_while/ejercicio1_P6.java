package proyecto;
import java.util.Scanner;
public class ejercicio1_P6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");

            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gracias por escoger la opcion 1");
                    System.out.println("Ha seleccionado la opción 1");
                    break;
                case 2:
                	System.out.println("Gracias por escoger la opcion 2");
                    System.out.println("Ha seleccionado la opción 2");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }
}
