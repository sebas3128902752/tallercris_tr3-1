package proyecto;

public class ejercicio2_P2 {
	 public static void main(String[] args) {
		 /*
		  * calcular area y perimetro de un circulo
		  * */
		 	
	        final double PI = 3.14159;
	        double radio = 5;

	        double area = PI * radio * radio;
	        double perimetro = 2 * PI * radio;

	        System.out.println("El área del círculo es: " + area);
	        System.out.println("El perímetro del círculo es: " + perimetro); 

	    }
}
