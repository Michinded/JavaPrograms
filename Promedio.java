import java.util.*;

public class Promedio {
	
	public static void main(String args[]){
		float Geo, Bio, Eng, Etica, BD, Prog, Promedio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Calcular el promedio del parcial");
		
		System.out.print("\n\nDigite la calificaci�n de Geometria: ");
		Geo = teclado.nextFloat();
		
		System.out.print("\nDigite la calificaci�n de Biolog�a: ");
		Bio = teclado.nextFloat();
		
		System.out.print("\nDigite su calificaci�n de Ingl�s: ");
		Eng = teclado.nextFloat();
		
		System.out.print("\nDigite su califici�n de �tica: ");
		Etica = teclado.nextFloat();
		
		System.out.print("\nDigite su calificaci�n de Base de Datos: ");
		BD = teclado.nextFloat();
		
		System.out.print("\nDigite su calificaci�n de Programaci�n: ");
		Prog = teclado.nextFloat();
		
		
		Promedio = Geo + Bio + Eng + Etica + BD + Prog;
		
		System.out.println("\n\nLa suma total es: "+Promedio);
		
		Promedio = Promedio/6;
		
		System.out.println("\n\nSu promedio es: "+Promedio);
	}
}
