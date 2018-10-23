package CicloWhile;
import java.util.*;

public class WhileSuma {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n1, n2, suma = 0, cont = 1;
		
		while(cont <=10) {
			
			System.out.print("\n************************************************");
			
			System.out.print("\nPar No: "+cont);
			
			System.out.print("\nIngrese un numero: ");
			n1 = kb.nextInt();
			
			System.out.print("\nIngrese otro numero: ");
			n2 = kb.nextInt();
			
			suma += n1 + n2;
			
			cont++;
		}
		
		System.out.print("\n\n\n************************************************");
		
		System.out.print("\n\nLa suma de los numeros es: "+suma);
		
	}
}
