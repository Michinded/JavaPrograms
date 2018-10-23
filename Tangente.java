import java.util.Scanner;

public class Tangente {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float an, r;
		/*
		 *  Esto saca el tangente de 30° = 0.57735026
		 
		*	Usa las demas funciones de Math para sacar las demas razones 
			trigonometricas
		*/
		
		System.out.print("\nIngrese un angulo: ");
		an = kb.nextFloat();
		
		r= (float) Math.tan(an*2.0*Math.PI/360.0);
		
		System.out.print("\n\nLa Tangente es: "+r);

	}
}
