package proyecto;

public class ejercicio1_P2 {
	 public static void main(String[] args) {
	    	/*
	    	 * cambio de temperatura de cel
	    	 * */
	        final double FACTOR_CELSIUS_A_FAHRENHEIT = 1.8;
	        final int SUMA_CELSIUS_A_FAHRENHEIT = 32;

	        double celsius = 37;
	        double fahrenheit = celsius * FACTOR_CELSIUS_A_FAHRENHEIT + SUMA_CELSIUS_A_FAHRENHEIT;

	        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
	    }
}
