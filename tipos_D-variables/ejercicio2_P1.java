package proyecto;

public class ejercicio2_P1 {
	public static void main (String arg[]) {
		int y= 2;
		int x= 10;
		System.out.println("valor de x=" +x+" valor de y=" +y);
		
		int z= y+x;
		System.out.println("la suma es:"+z);
		
		z= x-y;
		System.out.println("la resta es:"+z);
		
		z= x*y;
		System.out.println("la multiplicacion es:"+z);
		
		z= x/y;
		System.out.println("la division es:"+z);
		
		z= x%y;
		System.out.println("el modulo es:"+z);
		
		x=10;
		z= x++;
		System.out.println("el incremento es:"+z);
		
		x=10;
		z= ++x;
		System.out.println("el incremento es:"+z);
		
		x=10;
		z= x--;
		System.out.println("el decremento es:"+z);
		
		x=10;
		z= x--;
		System.out.println("el decremento es:"+z);
		
	}
}
