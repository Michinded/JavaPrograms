package If;
// import java.io.*;
import java.util.*;


public class Descuento {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String prod1,prod2, prod3, prod4, prod5, n;
		float p1, p2, p3, p4, p5, sumaprod, Iva, desc, n1= 1f, sub;
		String cad1, cad2, cad3, cad4, cad5;
		boolean EGG = false;
		
		if(n1==1) {
			EGG = true;
		}
		
		
		/* Dumentation 06/10/2018
		 * 
		 * Para resolver el problema (BUG) con los datos de tipo String
		 * use el meto de Casteo de Datos para que este pudiese leerlos
		 * Sin que este presente el error de Leer una cadena vacia al cambiar
		 * de linea o dar un salto de linea
		 * 
		 * Eso se debe a que la posición de lectura está justo después 
		 * de un salto de linea, lo que te retornara una cadena vacia,
		 *  así que te sugiero que después de leer cualquier número 
		 *  (int, double, float)
		 * 
		 */
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("El IVA esta en 16%\n\n");
		
		System.out.print("\nIngrese el nombre del Producto 1: ");
		cad1 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad1+": ");
		prod1 = kb.nextLine();
		
		
		p1 = Float.parseFloat(prod1);
		
		
		System.out.print("\n\nIngrese el nombre del Producto 2: ");
		cad2 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad2+": ");
		prod2 = kb.nextLine();
		
		
		p2 = Float.parseFloat(prod2);
		
		
		System.out.print("\n\nIngrese el nombre del Producto 3: ");
		cad3 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad3+": ");
		prod3 = kb.nextLine();
		
		
		p3 = Float.parseFloat(prod3);
		
		
		System.out.print("\n\nIngrese el nombre del Producto 4: ");
		cad4 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad4+": ");
		prod4 = kb.nextLine();
		
		
		p4 = Float.parseFloat(prod4);
		
		
		System.out.print("\n\nIngrese el nombre del Producto 5: ");
		cad5 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad5+": ");
		prod5 = kb.nextLine();
		
		
		p5 = Float.parseFloat(prod5);
		
		// ****************************************************\\
		
		sumaprod =  p1 + p2 + p3 + p4 + p5;
		
		Iva = (float) (sumaprod * 0.16);
		sub = sumaprod + Iva;
		
		if(sumaprod >= 500) {
			
			System.out.print("\n\nFelicidades se le realizará un descuento del 30%");
			System.out.print("\n(IVA Incluido)");
			
			desc = (float) (sub * 0.7);
			
			System.out.print("\n\nEl Subtotal es: $"+sumaprod);
			System.out.print("\nEl IVA del producto es: $"+Iva);
			System.out.print("\nEl Subtotal es: $"+sub);
			System.out.print("\nEl Total a pagar (Con descuento) es: $"+desc);
		}
		else {
			System.out.print("\n\nNo alcanza el desceunto del 30%");
			System.out.print("\nSe le descontará solo 5% ");
			System.out.print("\n(IVA Incluido)");
			
			desc = (float) (sub * 0.95);
			
			System.out.print("\n\nEl Subtotal es: $"+sumaprod);
			System.out.print("\nEl IVA del producto es: $"+Iva);
			System.out.print("\nEl Total a pagar (Con descuento) es: $"+desc);
			
		}
			String EG;
			float pago = 0, cambio;
			
			if (EGG == true) {
			System.out.print("\n\n\nCon cuanto desea pagar: ");
			EG = kb.nextLine();
			
			if(EG.matches("Con un benito||con un benito||CON UN BENITO")) {
				pago = 500;
				
				System.out.print("\n\n:v XD Prro");
			}
			else {
				pago = Float.parseFloat(EG);
			}
			
			}
			
			else {
				System.out.print("\n\n\nCon cuanto desea pagar: ");
				pago = kb.nextFloat();
				
			}
			
			cambio = pago - desc;
			
			System.out.print("\n\nSu Cambio es: $"+cambio);
			
			
			System.out.print("\n\n\nGracias por su compra :)");
	
	}

}
