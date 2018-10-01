import java.util.*;

public class Modulo {
	
	public static void main(String args[]) {
	
		Scanner teclado = new Scanner(System.in);
		float modulo, resultado;
		
		System.out.print("Ingrese el numero a sacer el modulo: ");
		modulo = teclado.nextFloat();
		
		resultado = modulo%2;
		
		System.out.print("\n\nEl resultado de Modulo es: "+resultado);
	}
	
}
