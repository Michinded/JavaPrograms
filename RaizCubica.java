import java.util.*;

public class RaizCubica {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		double numero, resultado;
		
		System.out.print("Ingrese el numero a sacr raiz cubica: ");
		numero = teclado.nextDouble();
		
		resultado = (double) Math.pow(numero, 1.0/3.0);
		
		System.out.println("\n\nReslutado:"+resultado);
	}
	
}
