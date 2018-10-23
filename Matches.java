import java.util.*;

public class Matches {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String cad;
		
		System.out.print("Ingresa un verbo: ");
		cad = kb.nextLine();
		
		if(cad.matches("CORRER||correr") /*|| cad.matches("correr")*/) {
			
			System.out.print("\n\nCorrecto");
		}
		
		else {
		
			System.out.print("\nError");
			
		}
		
		
	}

}
