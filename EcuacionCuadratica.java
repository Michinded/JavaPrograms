import java.util.*;

public class EcuacionCuadratica {

	public static void main(String args[]) {
		Scanner lea = new Scanner(System.in);
		
		double a,b,c,discriminante,x1,x2;
		System.out.print ("Ingrese El Coeficiente de A: ");
		a = lea.nextDouble();
		System.out.print ("\nIngrese El Coeficiente de B: ");
		b = lea.nextDouble();
		System.out.print ("\nIngrese El Coeficiente de C: ");
		c = lea.nextDouble();
		
		discriminante = ((b*b)-(4*(a*c)));

		
		x1 = (-b)+Math.sqrt(discriminante)/(2*a);
		x2 = (-b)-Math.sqrt(discriminante)/(2*a);
		System.out.print("\nX1 = " +x1+ "\nX2 = " +x2);
	}
}
