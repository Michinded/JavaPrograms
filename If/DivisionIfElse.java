package If;
import java.util.Scanner;

public class DivisionIfElse {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float nume, deno, coci;
		
		System.out.print("Ingrese el numerador: ");
		nume = kb.nextFloat();
		
		System.out.print("\nIngrese el denominador: ");
		deno = kb.nextFloat();
		
		
		if (deno == 0 ) {
			
			System.out.print("\n\nError, El denomindor no puede ser 0");
		}
		
		else {
			
			coci = deno / nume;
			
			System.out.print("\n\nCociente es igual a: "+coci);
		}
		
		
	}

}
