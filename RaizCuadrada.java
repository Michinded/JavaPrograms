import java.util.*;

public class RaizCuadrada {

	public static void main(String args[]) {
	
		Scanner teclado = new Scanner(System.in);
		float resultado, raiz = 0;
		
		System.out.print("Ingrese el número al que desee sacar la raiz: ");
		raiz = teclado.nextFloat();
		
		resultado = (float) Math.sqrt(raiz);
		
		
		System.out.print("\n\nEl resultado es: "+resultado);
	}
	
}
