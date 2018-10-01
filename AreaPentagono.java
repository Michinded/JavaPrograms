
import java.util.*;

public class AreaPentagono {
  public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		float lado, ap, perimetro, r;
		
		System.out.print("Ingrese el valor de un lado: ");
		lado = teclado.nextFloat();
		
		perimetro = lado * 5;
		
		ap = (float) (lado / 1.45);
		
		r = (perimetro * ap)/2;
		
		System.out.print("El area del pentogono es: "+r);
	}
}
