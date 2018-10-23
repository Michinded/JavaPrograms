package Matrices;

import java.util.*;

public class Matrices3 {

	public static void main(String args[]) {
		
		Scanner kb = new Scanner(System.in);
		int fil, col;
		
		System.out.print("Ingrese la cantidad de filas: ");
		fil = kb.nextInt();
		
		System.out.print("Ingrese la cantidad de columnas: ");
		col = kb.nextInt();
		
		int mtx1[][] = new int [fil][col];
		int mtx2[][] = new int [fil][col];
		int mtx3[][] = new int [fil][col];
		
		int i, j;
		
		
		System.out.print("\nLLenado de la primer matriz\n");
		
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				System.out.print("\nIngrese el elemento en la posicion ["+i+","+j+"]: ");
				mtx1[i][j] = kb.nextInt();
				
			}
			
		}
			
		System.out.print("\n\n\nLLenado de la Segunda Matriz\n");
		
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				System.out.print("\nIngrese el elemento la posicion ["+i+","+j+"]: ");
				mtx2[i][j] = kb.nextInt();
				
			}
		}
		
		System.out.print("\n\n\nMatriz 1\n");
		
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				mtx3[i][j] = mtx1[i][j] * mtx2[i][j];
				
				System.out.print("\t"+mtx1[i][j]);
				
			}
			System.out.print("\n");
		}
		
		System.out.print("\n\n\nMatriz 2\n");
		
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				mtx3[i][j] = mtx1[i][j] * mtx2[i][j];
				
				System.out.print("\t"+mtx2[i][j]);
				
			}
			System.out.print("\n");
		}
		
		
		
		System.out.print("\n\n\nMatriz Resultante de la Multiplicacion\n");
		
		
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				mtx3[i][j] = mtx1[i][j] * mtx2[i][j];
				
				System.out.print("\t"+mtx3[i][j]);
				
			}
			System.out.print("\n");
		}
		
		
	}
}
