import java.util.*;

public class AreaParalelogramo {
	
	public static void main(String args[]) {
	
		Scanner teclado = new Scanner(System.in);
		float base, altura, resultado;
		
		System.out.print("Ingrese la base del Paralelogramo: ");
		base = teclado.nextFloat();
		
		System.out.print("\nIngrese la altura del paralelogramo: ");
		altura = teclado.nextFloat();
		
		resultado = base * altura;
		
		System.out.print("\n\nEl resultado es: "+resultado);
	}
}
