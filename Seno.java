import java.util.*;

public class Seno {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float an, r;
		/*
		 *  Esto saca el seno de 30°
		 
		*	Usa las demas funciones de Math para sacar las demas razones 
			trigonometricas
		*/
		
		System.out.print("\nIngrese un angulo: ");
		an = kb.nextFloat();
		
		r= (float) Math.sin(an*2.0*Math.PI/360.0);
		
		System.out.print("\n\nEl seno es: "+r);

	}
}
