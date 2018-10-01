import java.util.*;

public class FormulaOrtoedro {

	public static void main(String args[]) {
		
			
			Scanner teclado = new Scanner(System.in);
			float b, h, a, vol;
			
			System.out.print("Ingrese la base: ");
			b = teclado.nextFloat();
			
			System.out.print("\nIngrese la altura: ");
			h = teclado.nextFloat();
			
			System.out.println("\nIngrese el ancho: ");
			a = teclado.nextFloat();
			
			vol = b * h * a;
			
			System.out.print("\n\n El volumen es: "+vol);
		
	}
}
