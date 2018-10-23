package If;
import java.util.*;

public class Promedio_If_Else {

	public static void main(String args[]){
		float Geo, Bio, Eng, Etica, BD, Prog, Promedio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Calcular el promedio del parcial");
		
		System.out.print("\n\nDigite la calificación de Geometria: ");
		Geo = teclado.nextFloat();
		
		System.out.print("\nDigite la calificación de Biología: ");
		Bio = teclado.nextFloat();
		
		System.out.print("\nDigite su calificación de Inglés: ");
		Eng = teclado.nextFloat();
		
		System.out.print("\nDigite su califición de Ética: ");
		Etica = teclado.nextFloat();
		
		System.out.print("\nDigite su calificación de Base de Datos: ");
		BD = teclado.nextFloat();
		
		System.out.print("\nDigite su calificación de Programación: ");
		Prog = teclado.nextFloat();
		
		
		Promedio = Geo + Bio + Eng + Etica + BD + Prog;
		
		Promedio = Promedio/6;
		
		if(Promedio < 6) {
			
			System.out.print("\n\nUsted esta Reprobado :(");
			
		}
		
		System.out.println("\n\nSu promedio es: "+Promedio);
	
	
	}
}
