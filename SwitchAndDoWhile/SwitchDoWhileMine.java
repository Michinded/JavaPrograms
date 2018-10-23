package SwitchAndDoWhile;

import java.util.Scanner;

public class SwitchDoWhileMine {
	public static void main(String args[]) {
		int opc;
		
		do {
			
			System.out.print("\n\nMenu Principal");
			System.out.print("\n1. Multiplicaion de Matrices");
			System.out.print("\n2. LLENADO DE UNA MATRIZ");
			System.out.print("\n3. MATCHES");
			System.out.print("\n4. RAIZ DE UN NÚMERO");
			System.out.print("\n5. EXIT");
			System.out.print("\n\nIngresa la Opcion que deseas: ");
			Scanner kb = new Scanner(System.in);
			opc = kb.nextInt();
			
			switch(opc) {
			
			case 1: {
				int mt1[][] = new int[5][5];
				int mt2[][] = new int[5][5];
				int mt3[][] = new int[5][5];
				System.out.print("\n\nSE LLENARA");
				
			}break;
			
			
			case 2:{
				
			}break;
			
			
			case 3:{
				
			}break;
			
			
			case 4:{
				
			}break;
			
			
			case 5:{
				
			}break;
			
			
				default:{
					System.out.print("\n\nLA OPCION NO EXISTE!!");
					System.out.print("\n INGRESE UN VALOR VALIDO!!");
				}break;
					
			}
			
		}while(opc != 5);
		
	}


}
