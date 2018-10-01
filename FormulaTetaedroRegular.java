import java.util.*;

public class FormulaTetaedroRegular {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		float arista, r;
		
		System.out.print("Ingrese el valor del Arista: ");
		arista = teclado.nextFloat();
		
		r = (float) (Math.sqrt(2) * (arista * arista * arista))/12;
		
		System.out.print("\nE resultado es: "+r);
		
	}
}
