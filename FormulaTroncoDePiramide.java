import java.util.*;

public class FormulaTroncoDePiramide {

	public static void main(String args []) {
		Scanner teclado = new Scanner(System.in);
		float h, Am, AM, b, a, r;
		
		System.out.print("Ingrese la base del rectangulo mayor: ");
		b = teclado.nextFloat();
		
		System.out.print("\nIngrese la altura del rectangulo mayor: ");
		a = teclado.nextFloat();
		
		AM = b * a;
		
		System.out.print("\nIngrese la base del rectangulo menor: ");
		b = teclado.nextFloat();
		
		System.out.print("\nIngrese la altura del rectangulo menor: ");
		a = teclado.nextFloat();
		
		Am = b * a;
		
		System.out.print("\nIngrese la Altuta del Prisma: ");
		h = teclado.nextFloat();
		
		
		r = (h/3) * (AM + Am + (float) Math.sqrt(Am*AM));
		
		System.out.print("\n\nEl Volumen es: "+r);
	}
}
