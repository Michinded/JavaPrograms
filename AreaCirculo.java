import java.util.*;

public class AreaCirculo {
	
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
	float radio, resultado;
	
	System.out.print("Ingrese el Radio: ");
		radio = teclado.nextFloat();
		
		resultado = radio * radio;
		
		resultado = (float) (resultado * 3.1416); 
		
		
		System.out.print("El Area es: : "+resultado);
	
	}
}
