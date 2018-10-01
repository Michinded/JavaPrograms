import java.util.Scanner;

public class AreaRectangulo {
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		float base, altura, area;
		
		System.out.print("Ingrese la base: ");
		base = teclado.nextFloat();
		
		System.out.print("Ingrese la Altura: ");
		altura = teclado.nextFloat();
		
		area = base * altura;
		
		System.out.print("\n\nLa Area del Rectangulo es: "+area+"m2");
	}

}
