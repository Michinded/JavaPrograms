import java.util.*;

public class TeoremaDePitagoras {
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		float c, a, b;
		
		System.out.print("Ingrese el cateto Adyacente: ");
		a = teclado.nextFloat();
		
		System.out.println("\nIngrese el cateto opuesto: ");
		b = teclado.nextFloat();
		
		c = (float) Math.sqrt((a * a)+ (b * b));
		
		System.out.print("\n\nLa Hipotenusa es: "+c);
	}
}
