import java.util.*;

public class Coseno {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float an, r;
		/*
		 *  Esto saca el coseno de 30° = 0.8660254
		 
		*	Usa las demas funciones de Math para sacar las demas razones 
			trigonometricas
		*/
		
		System.out.print("\nIngrese un angulo: ");
		an = kb.nextFloat();
		
		r= (float) Math.cos(an*2.0*Math.PI/360.0);
		
		System.out.print("\n\nEl coseno es: "+r);

	}
}
