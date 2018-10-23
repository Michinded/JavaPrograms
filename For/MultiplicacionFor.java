package For;
import java.util.*;

public class MultiplicacionFor {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int num1, num2, mul;
		
		for (int i = 1; i<=10; i++) {
			
			System.out.print("\nPar numero: "+i);
			System.out.print("\n\nIngrese un numero: ");
			num1 = kb.nextInt();
			
			System.out.print("Ingrese otro numero: ");
			num2 = kb.nextInt();
			
			mul = num1 * num2;
			
			System.out.print("\nLa multiplicacion de los numeros es: "+ mul);
			
			System.out.print("\n\n\n");
			System.out.print("*********************************************");
		}
		
		System.out.print("\n\nFinish");
	}
}
