package If;
import java.util.Scanner;

public class Descuento3 {

public static void main(String[] args) {
		
		// Para este usa solamente se usa un kb.nextLine();
		//  Debajo de cada Float
		Scanner kb = new Scanner(System.in);
		String prod1,prod2, prod3, prod4, prod5;
		float p1, p2, p3, p4, p5, sumaprod, Iva, desc, sub;
		String cad1, cad2, cad3, cad4, cad5;
		
		
		System.out.print("El IVA esta en 16%\n\n");
		
		System.out.print("\nIngrese el nombre del Producto 1: ");
		cad1 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad1+": ");
		p1 = kb.nextFloat();
		
		kb.nextLine();
		
		//p1 = Float.parseFloat(prod1);
		
		
		System.out.print("\n\nIngrese el nombre del Producto 2: ");
		cad2 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad2+": ");
		p2 = kb.nextFloat();
		
		kb.nextLine();
		//p2 = Float.parseFloat(prod2);
		
		
		System.out.print("\n\nIngrese el nombre del Producto 3: ");
		cad3 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad3+": ");
		p3 = kb.nextFloat();
		
		
		kb.nextLine();
		//p3 = Float.parseFloat(prod3);
		
		
		System.out.print("\n\nIngrese el nombre del Producto 4: ");
		cad4 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad4+": ");
		p4 = kb.nextFloat();
		
		kb.nextLine();
		// p4 = Float.parseFloat(prod4);
		
		
		
		System.out.print("\n\nIngrese el nombre del Producto 5: ");
		cad5 = kb.nextLine();
		System.out.print("\nIngrese el costo del Producto "+cad5+": ");
		p5 = kb.nextFloat();
		
		kb.nextLine();
		
		//p5 = Float.parseFloat(prod5);
		
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
		
	
			System.out.print("\n\n\nGracias por su compra :)");
	
	}
}
