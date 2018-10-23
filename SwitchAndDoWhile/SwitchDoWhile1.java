package SwitchAndDoWhile;
import java.util.*;

public class SwitchDoWhile1 {

	public static void main(String args[]) {
		int opc;
		
		do {
			
			System.out.print("\n\nMenu Principal");
			System.out.print("\n1. SUMAS");
			System.out.print("\n2. RESTAS");
			System.out.print("\n3. MULTIPLICACIONES");
			System.out.print("\n4. DIVISIONES");
			System.out.print("\n5. EXIT");
			System.out.print("\n\nIngresa la Opcion que deseas: ");
			Scanner kb = new Scanner(System.in);
			opc = kb.nextInt();
			
			switch(opc) {
			
			case 1: {
				int n1, n2, suma;
				System.out.print("\n SUMA");
				System.out.print("\n Ingrese un numero: ");
				n1 = kb.nextInt();
				System.out.print("\n Ingrese otro numero: ");
				n2 = kb.nextInt();
				
				suma = n1 + n2;
				
				System.out.print("\n La suma es: "+suma);
			}break;
			
			case 2:{
				int n1, n2, resta;
				System.out.print("\n RESTA");
				System.out.print("\n Ingrese un numero: ");
				n1 = kb.nextInt();
				System.out.print("\n Ingrese otro numero: ");
				n2 = kb.nextInt();
				
				resta = n1 - n2;
				
				System.out.print("\n La Resta es: "+resta);
			}break;
			
			case 3:{
				int n1, n2, mul;
				System.out.print("\n MULTIPLICACIONES");
				System.out.print("\n Ingrese un numero: ");
				n1 = kb.nextInt();
				System.out.print("\n Ingrese otro numero: ");
				n2 = kb.nextInt();
				
				mul = n1 * n2;
				
				System.out.print("\n La Multiplicacion es: "+mul);
			}break;
			
			case 4:{
				float n1, n2, Div;
				System.out.print("\n DIVISIONES");
				System.out.print("\n Ingrese un numero: ");
				n1 = kb.nextInt();
				System.out.print("\n Ingrese otro numero: ");
				n2 = kb.nextInt();
				
				Div = n1 / n2;
				
				System.out.print("\n La Division es: "+Div);
			}break;
			
			case 5:{
				System.out.print("\n ELIGIO SALIR!!\n\n******* EL PRGRAMA HA TERMINADO *******");
			}break;
			
				default:{
					System.out.print("\n\nLA OPCION NO EXISTE!!");
					System.out.print("\n INGRESE UN VALOR VALIDO!!");
				}break;
					
			}
			
		}while(opc != 5);
		
	}
}
