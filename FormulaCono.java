import java.util.*;

public class FormulaCono {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
float Radio, h, Pi = 3.1415926535f, r;
		
		System.out.print("\nIngrese el radio:  ");
		Radio = teclado.nextFloat();
		
		System.out.print("\nIngrese la altura: ");
		h = teclado.nextFloat();
		
		r = ((Pi * (Radio * Radio)) * h)/3;
		
		System.out.println("\nEl volumen es:  "+r);
	}
}
