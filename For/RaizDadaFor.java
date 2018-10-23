package For;
import java.util.*;

public class RaizDadaFor {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		float raiz, num;
		
		for (int i = 1; i<=10; i++) {
			
			System.out.print("\nIngrese un numero a sacar la Raiz ("+i+"): ");
			num = kb.nextFloat();
			
			raiz = (float) Math.sqrt(num);
			
			System.out.print("\nLa Raiz del numero dado es: "+raiz);
			
			System.out.print("\n\n");
		}
		
	}
}
