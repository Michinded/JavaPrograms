import java.util.*;

public class Casteo {

	public static void main (String args[]) {
		
		Scanner kb = new Scanner(System.in);
		String cadena, cadena2;
		int num1, num2, prod;
		
		System.out.print("Ingrese una cadena: ");
		cadena = kb.nextLine();
		
		System.out.print("\nIngrese otra cadena: ");
		cadena2 = kb.nextLine();
		
		num2 = Integer.parseInt(cadena2);
		
		num1 = Integer.parseInt(cadena);
		
		
		prod = num1 + num2;
		
		System.out.print("\n\nSuma: "+prod);
		
		
		prod = num1 - num2;
		
		System.out.print("\nResta: "+prod);
		
		
		prod = num1 * num2;
		
		System.out.print("\nMultiplicacion: "+prod);
		
		
		prod = num1 / num2;
		
		System.out.print("\nDivision: "+prod);
	}
}
