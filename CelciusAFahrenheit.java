import java.util.*;

public class CelciusAFahrenheit {
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		float Celcius, conversion;
		
		System.out.print("Ingrese los grados Celcius a canvertir a Fahrenheit: ");
		Celcius = teclado.nextFloat();
		
		conversion = Celcius * 9/5 + 32;
		
		System.out.print("\nLos grados Fahrenheit equivalentes son: "+conversion);
		
		System.out.print("\n\nAhora convertiremos Fahrenheit a Celcius");
		
	}

}
