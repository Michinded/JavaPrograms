import java.util.*;

public class AritmeticosYPromedio {
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		float num1, num2, resultado;
		float G, P, BD, E, I, B, prom;
		
		System.out.print("Ingrese el primer numero: ");
		num1 = teclado.nextFloat();
		
		System.out.print("Ingrese el segundo numero: ");
		num2 = teclado.nextFloat();
		
		//Parte para la Suma
		
		System.out.print("\n\nSuma de los numeros");
		
		resultado = num1 + num2;
		System.out.print("\nLa suma es: "+ resultado);
		
		//Parte para la Resta
		
		System.out.print("\n\nResta de los numeros");
		
		resultado = num1 - num2;
		System.out.print("\nLa Resta es: "+ resultado);
		
		//Parte para la Multiplicación
		
		System.out.print("\n\nMultiplicacion de los numeros");
		
		resultado = num1 * num2;
		System.out.print("\nLa Multiplicacion es: "+ resultado);
		
		
		//parte para la División
		
		System.out.print("\n\nDivision de los numeros");
		
		resultado = num1 / num2;
		System.out.print("\nLa Division es: "+ resultado);
		
		//Parte para el promedio :v
		
		System.out.print("\n\nCalcular el promedio del parcial");
		
		System.out.print("\n\nDigite la calificación de Geometria: ");
		G = teclado.nextFloat();
		
		System.out.print("\nDigite la calificación de Biología: ");
		B = teclado.nextFloat();
		
		System.out.print("\nDigite su calificación de Inglés: ");
		I = teclado.nextFloat();
		
		System.out.print("\nDigite su califición de Ética: ");
		E = teclado.nextFloat();
		
		System.out.print("\nDigite su calificación de Base de Datos: ");
		BD = teclado.nextFloat();
		
		System.out.print("\nDigite su calificación de Programación: ");
		P = teclado.nextFloat();
		
		
		prom = G + B + I + E + BD + P;
		
		System.out.println("\n\nLa suma total es: "+prom);
		
		prom = prom/6;
		
		System.out.println("\n\nSu promedio es: "+prom);
	}
}
