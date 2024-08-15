package proyecto;

public class ejercicio3_P2 {
	 public static void main(String[] args) {
		 final double PORCENTAJE_DESCUENTO = 15; 
	        final double IMPUESTO_VENTAS = 0.08; 

	        double precioOriginal = 100;

	 
	        double descuento = precioOriginal * PORCENTAJE_DESCUENTO / 100;

	    
	        double precioConDescuento = precioOriginal - descuento;

	     
	        double impuesto = precioConDescuento * IMPUESTO_VENTAS;


	        double precioFinal = precioConDescuento + impuesto;

	        System.out.println("El precio final de la compra es: $" + precioFinal);
	    
	 }
}
