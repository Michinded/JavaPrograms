import java.util.*;

public class Promedio {
	
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
		
		System.out.println("\n\nLa suma total es: "+Promedio);
		
		Promedio = Promedio/6;
		
		System.out.println("\n\nSu promedio es: "+Promedio);
	}
}
