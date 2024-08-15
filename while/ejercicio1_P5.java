package proyecto;
import java.util.Scanner;
public class ejercicio1_P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el límite: ");
        int limite = scanner.nextInt();

        int numero = 1;
        int suma = 0;

        while (numero <= limite) {
            suma += numero;
            numero++;
        }

        System.out.println("La suma de los números hasta " + limite + " es: " + suma);
    }

}
