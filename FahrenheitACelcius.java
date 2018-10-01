import java.util.*;

public class FahrenheitACelcius {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		float Fahren, conversion;
		
		
		System.out.print("\nIngrese la cantidad de Grados Fahrenhiet: ");
		Fahren = teclado.nextFloat();
		
		conversion = (Fahren - 32) * 5/9;
		
		System.out.print("\nLos grados Celcius equivalentes son: "+conversion);
	}
}
