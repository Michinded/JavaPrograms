import java.util.*;

public class Resta {
	
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, resultado;
		
		System.out.print("Realizar una resta de dos n�meros");
		
		System.out.print("\n\nTeclee el primer n�mero: ");
		numero1 = teclado.nextInt();
		
		System.out.print("\nTeclee el segundo n�mero: ");
		numero2 = teclado.nextInt();
		
		resultado = numero1 - numero2;
		
		System.out.print("\n\nEl resultado de la resta es: "+resultado);
	}

}
