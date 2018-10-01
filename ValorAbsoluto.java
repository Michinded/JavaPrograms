import java.util.*;

public class ValorAbsoluto {
	
	public static void main(String args[]) {
		float AB, Resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("ingrese el numero a sacar el valor Absoluto: ");
		AB = teclado.nextFloat();
		
		Resultado = (float) Math.abs(AB);
		
		System.out.print("\n\nEl Valor Absoluto es: "+Resultado);
	}

}
