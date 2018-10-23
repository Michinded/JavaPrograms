import java.util.*;

public class PuntoMedioPorRazon {

	public static void main(String args []) {
		Scanner kb = new Scanner(System.in);
		float x1, x2, raz, raz2, y1, y2, deno, nume, X, Y;
		
		System.out.print("\nIngrese X1: ");
		x1 = kb.nextFloat();
		
		System.out.print("\nIngrese X2: ");
		x2 = kb.nextFloat();
		
		System.out.print("\nIngrese Y1: ");
		y1 = kb.nextFloat();
		
		System.out.print("\nIngrese Y2: ");
		y2 = kb.nextFloat();
		
		System.out.print("\n\nIngrese la razon (En Fraccion)");
		
		System.out.print("\n\nIngrese  el  numerador: ");
		nume = kb.nextFloat();
		
		System.out.print("\nIngrese el denominador: ");
		deno = kb.nextFloat();
		
		raz = nume / deno;
		
		raz2 = raz + 1;
		
		X = (x1 + (raz * x2)) / raz2;
		
		Y = (y1 + (raz * y2)) / raz2;
		
		System.out.print("\n\n El punto X es: "+X);
		
		System.out.print("\n\n El punto Y es: "+Y);
	}
}
