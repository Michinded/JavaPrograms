import java.util.*;

public class Trapecio {
	
	public static void main(String arg[]) {
		
		Scanner teclado = new Scanner(System.in);
		float baseM, basem, altura, resultado;
		
		System.out.print("ingrese la base Mayor: ");
		baseM = teclado.nextFloat();
		
		System.out.print("\nIngrese la base Menor: ");
		basem = teclado.nextFloat();
		
		System.out.print("\nIngrese la altura: ");
		altura = teclado.nextFloat();
		
		resultado = (baseM + basem)/2 * altura;
		
		System.out.print("La Area es: "+resultado);
		
	}
}
