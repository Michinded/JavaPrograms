import java.util.*;

public class Division {

	public static void main(String args[]){
		float numero1, numero2, Resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Realizar la divisi�n de dos n�meros");
		
		System.out.print("\n\nIngrese el primer n�mero: ");
		numero1 = teclado.nextFloat();
		
		System.out.print("\nIngrese el segundo termino: ");
		numero2 = teclado.nextFloat();
		
		Resultado = numero1 / numero2;
		
		System.out.print("\n\nEl Resultado de la divisi�n es: "+Resultado);
	}
}
