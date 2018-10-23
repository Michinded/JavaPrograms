package If;
import java.util.*;

public class Par_E_impar {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int number, r, var2;
		boolean var = false;
		
		System.out.print("Ingrese un numero: ");
		number = kb.nextInt();
		
		// **** activar el codigo parte 2 **** \\
		var2 = kb.nextInt();
		if(var2 == 1) {
			var = true;
		}
		// *********************************** \\
		
		if(number%2== 0) {
			
			System.out.print("\nSu numero es par!!");
	
		}
		
		else {
			
			System.out.print("\nSu numero es impar");
			
		}
		
		// ------- Proceso numero 2 -------- \\
		
		if(var == true) {
		
		r = number / 2;
		
		if(r * r == number) {
			
			System.out.print("\n\nEs par");
		}
		
		else {
			
			System.out.print("\n\nEs impar");
		}
		
		}
		
		// **************************************** \\
	}
	
}
