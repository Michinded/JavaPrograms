import java.util.*;

public class MyProgram {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		boolean resp = false;
		int opc = 0;
		
		System.out.print("Examen!!!");
		
		System.out.print("\nCual de las siguientes Sintaxis es correcta (JAVA)");
		
		System.out.print("\n\n1. System.out.printf( text, var )");
		
		System.out.print("\n2. System.out.print( text, var)");
		
		System.out.print("\n\n Elija una opcion: ");
		opc = kb.nextInt();
		
		if(opc == 1) {
			
			System.out.print("\n\n Respuesta Incorrecta :(");
		}
		
		if(opc==2) {
			
			System.out.print("\n\n Respuesta Correcta :)");
			
		}
		
	}
}
