import java.util.*;

public class FormulaCilindro {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		float Radio, h, Pi = 3.1415926535f, r;
		
		System.out.println("\nIngrese el radio:  ");
		Radio = teclado.nextFloat();
		
		System.out.println("\n Ingrese la altura: ");
		h = teclado.nextFloat();
		
		r = (Pi * (Radio * Radio)) * h;
		
		System.out.println("\nEl volumen es:  "+r);
		
	}
}
