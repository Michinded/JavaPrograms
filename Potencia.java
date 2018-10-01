import java.util.*;

public class Potencia {
	
	public static void main(String args[]) {
	
		Scanner teclado = new Scanner(System.in);
		float resultado, base, expo;
		
		System.out.print("Ingrese la base: ");
		base = teclado.nextFloat();
		
		System.out.print("\nIngrese el exponente: ");
		expo = teclado.nextFloat();
		
		resultado = (float) Math.pow(base, expo);
		
		System.out.print("\n\nLa potencia es: "+resultado);
	}
}
