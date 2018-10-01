
import java.util.*;


public class AreaRombo {
	
	public static void main(String args[]) {
		float D, d, area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese la Diagonal Mayor: ");
		D = teclado.nextFloat();
		
		System.out.print("\nIngrese la diagonal menor: ");
		d = teclado.nextFloat();
		
		area = (D * d) / 2;
		
		System.out.print("\n\nEl area es: "+area);
	}
}
