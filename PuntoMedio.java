import java.util.*;

public class PuntoMedio {

	public static void main(String args[]) {
		
		Scanner kb = new Scanner(System.in);
		float x1, x2, y1, y2, X, Y, PM;
		
		System.out.print("Ingrese X1: ");
		x1 = kb.nextFloat();
		
		System.out.print("\nIngrese Y1: ");
		y1 = kb.nextFloat();
		
		System.out.print("\nIngrese X2: ");
		x2 = kb.nextFloat();
		
		System.out.print("\nIngrese Y2: ");
		y2 = kb.nextFloat();
		
		X = (x2+x1)/2;
		
		Y = (y2+y1)/2;
		
		System.out.print("\n\nEl punto medio es \nX1= "+X+"\nY= "+Y);
		
		
	}
}
