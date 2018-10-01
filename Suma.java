import java.util.*;

public class Suma {
	
	public static void main(String args[]){
		int termino1, termino2, resultado;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Realizar una Suma de dos números\n\n");
		
		System.out.print("\nIngrese el primer termino: ");
		termino1= teclado.nextInt();
		
		System.out.print("\nIngrese el Segundo termino: ");
		termino2= teclado.nextInt();
		
		resultado = termino1 + termino2;
		
		System.out.print("\n\nEl resultado de la suma es: "+resultado);
		
	}

}
