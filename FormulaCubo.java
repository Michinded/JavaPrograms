import java.util.*;

public class FormulaCubo {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		float l1, l2, l3, vol;
		
		System.out.print("Ingrese el lado 1: ");
		l1 = teclado.nextFloat();
		
		System.out.print("\nIngrese el lado 2: ");
		l2 = teclado.nextFloat();
		
		System.out.println("\nIngrese el lado 3: ");
		l3 = teclado.nextFloat();
		
		vol = l1 * l2 * l3;
		
		System.out.print("\n\n El volumen es: "+vol);
	}
}
