import java.util.Scanner;

public class FormulaPrismaRecto {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		float a, h, r;
		
		System.out.print("Ingrese el apotema: ");
		a = teclado.nextFloat();
		
		System.out.print("\nIngrese la altura: ");
		h = teclado.nextFloat();
		
		r = a * h;
		
		System.out.print("\nEl volumen es: "+r);
	}
}
