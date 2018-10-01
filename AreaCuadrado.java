import java.util.*;

public class AreaCuadrado {
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		float lado1, lado2, area;
		
		System.out.print("Ingrese el primer lado: ");
		lado1 = teclado.nextFloat();
		
		System.out.print("Ingrese segundo lado: ");
		lado2 = teclado.nextFloat();
		
		area = lado1 * lado2;
		
		System.out.print("La Area del Cuadrado es: "+area+"m2");
	}
}
