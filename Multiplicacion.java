import java.util.*;

public class Multiplicacion {
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in); 
		int num1, num2, resultado;
		
		System.out.print("Multiplicai�n de dos n�meros");
		
		System.out.print("\n\nDigite el Primer n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.print("\nDigite el Segundo n�mero: ");
		num2 = teclado.nextInt();
		
		resultado = num1 * num2;
		
		System.out.print("\n\nEl resultado es: "+resultado);
	}

}
