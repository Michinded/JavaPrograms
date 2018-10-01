import java.util.*;

public class AreaTriangulo {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		float baseT, alturaT, area, area2;
		
		System.out.print("Ingrese la base: ");
		baseT = teclado.nextFloat();
		
		System.out.print("Ingrese la Altura: ");
		alturaT = teclado.nextFloat();
		
		area = baseT * alturaT;
		
		area2 = area/2;
		
		System.out.print("\n\nLa Area del Rectangulo es: "+area2+"m2");
	}

}
