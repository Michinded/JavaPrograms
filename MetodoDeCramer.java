import java.util.*;

public class MetodoDeCramer {

	public static void main(String args[]) {
		float a, b, c, d, e, f, x, y, deno;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Ingrese a: ");
		a = teclado.nextFloat();
		
		System.out.print("\nIngrese b: ");
		b = teclado.nextFloat();
		
		System.out.print("\nIngrese c: ");
		c = teclado.nextFloat();
		
		System.out.print("\nIngrese d: ");
		d = teclado.nextFloat();
		
		System.out.print("\nIngrese e: ");
		e = teclado.nextFloat();
		
		System.out.print("\nIngrese f: ");
		f = teclado.nextFloat();
		
		deno= ((a * e)-(d * b));
		if (d!=0) {
		   	System.out.print("\nESTA ECUACION NO ES POSIBLE");
		}else {
		x = ((c * e) - (f * b) ) / ((a * e)-(d * b));
		
		y = ((a * f) - (d * c)) / ((a *e )- (d * b));
		
		System.out.print("\n\nX = "+x+"\n\nY = "+y);
		}
	}
}