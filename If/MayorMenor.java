package If;
import java.util.*;

public class MayorMenor {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		float num1, num2, r;
		
		System.out.print("Ingrese un numero: ");
		num1 = kb.nextFloat();
		
		System.out.print("\nIngrese otro numero: ");
		num2 = kb.nextFloat();
		
		if(num1 > num2) {
			
			System.out.print("\n\nSe realizará una multiplicación");
			
			r = num1 * num2;
			
			System.out.print("\n\n La multiplicación es: "+r);
			
		}
		else {
			
			System.out.print("\n\nSe realizará una división");
			
			r = num1 / num2;
			
			System.out.print("\n\n La multip´licación es: "+r);
			
		}
		
	}
}
