import java.util.Scanner;

public class FormulaTroncoDeCono {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
	
		float RM, Rm, h, Pi = 3.1415926535f, r;
		
		System.out.print("\nIngrese el radio Mayor:  ");
		RM = teclado.nextFloat();
		
		System.out.print("\nIngrese el radio Menor:  ");
		Rm = teclado.nextFloat();
		
		System.out.println("\n Ingrese la altura: ");
		h = teclado.nextFloat();
		
		r = ((h * Pi)/3) * ((RM *RM) + (Rm *Rm) + (RM * Rm));
		
		System.out.println("\nEl volumen es:  "+r);
	}
}
