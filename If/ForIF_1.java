package If;
import java.util.*;
public class ForIF_1 {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		float suma, resta, num1, num2;
		
		for (int i = 1; i<=10; i++) {
			
			System.out.print("Bloque "+i);
			if( i%2 == 0) {
				//Suma
				System.out.print("\n\nIngresa un numero: ");
				num1 = kb.nextFloat();
				
				System.out.print("Ingresa otro numero: ");
				num2 = kb.nextFloat();
				
				suma = num1 + num2;
				
				System.out.print("\n La suma es: "+suma);
			}
			else {
				//Resta
				System.out.print("\n\nIngresa un numero: ");
				num1 = kb.nextFloat();
				
				System.out.print("Ingresa otro numero: ");
				num2 = kb.nextFloat();
				
				resta = num1 - num2;
				
				System.out.print("\n La resta es: "+resta);
			}
			
			System.out.print("\n\n\n*********************************\n");
			
		}
	}
}
