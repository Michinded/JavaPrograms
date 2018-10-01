import java.util.*;

public class FormulaOctaedroRegular {

public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		float a, r;
		
		System.out.print("Ingrese el valor del Arista: ");
		a = teclado.nextFloat();
		
		r = (float) (Math.sqrt(2) * (a * a * a))/3;
		
		System.out.print("\nE resultado es: "+r);
		
	}
}
