import java.util.*;

public class Division {

	public static void main(String args[]){
		float numero1, numero2, Resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Realizar la división de dos números");
		
		System.out.print("\n\nIngrese el primer número: ");
		numero1 = teclado.nextFloat();
		
		System.out.print("\nIngrese el segundo termino: ");
		numero2 = teclado.nextFloat();
		
		Resultado = numero1 / numero2;
		
		System.out.print("\n\nEl Resultado de la división es: "+Resultado);
	}
}
