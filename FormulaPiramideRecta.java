import java.util.*;

public class FormulaPiramideRecta {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		float a, h, r, b ;
		
		System.out.print("Ingrese el ancho: ");
		a = teclado.nextFloat();
		
		System.out.print("\nIngrese la altura: ");
		h = teclado.nextFloat();
		
		System.out.print("\nIngrese la base: ");
		b = teclado.nextFloat();
		
		r = (a * h * b)/3;
		
		System.out.print("\nEl vlolumen es: "+r);
	}
}
