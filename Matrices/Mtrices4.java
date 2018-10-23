package Matrices;
import java.util.*;

public class Mtrices4 {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int fil, col;
		
		System.out.print("\nIngrese la cantidad de filas: ");
		fil = kb.nextInt();
		
		System.out.print("\nIngrese el numero de columnas: ");
		col = kb.nextInt();
		
		int mt1[][] = new int [fil][col];
		int mt2[][] = new int [fil][col];
		int mt3[][] = new int [fil][col];
		
		int i, j;
		float ran = 0f;
		
		
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				ran = (float) Math.random()*10;
				
				mt1[i][j] = (int) ran;
				
				ran = (float) Math.random()*10;
				
				mt2[i][j] = (int) ran;
				
				mt3[i][j] = mt1[i][j] * mt2[i][j];
				
			}
		}
		
		//*************************************
		
		System.out.print("\n\n\nMtriz número 1\n\n");
		
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				System.out.print("\t"+mt1[i][j]);
				
			}
			System.out.print("\n");
		}
		
		//************************************
		System.out.print("\n\n\nMatriz número 2\n\n");
		
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				System.out.print("\t"+mt2[i][j]);
				
			}
			System.out.print("\n");
		}
		//**************************************
		
		
		System.out.print("\n\n\nMatriz Resultante\n\n");
		for(i=0; i<fil; i++) {
			
			for(j=0; j<col; j++) {
				
				System.out.print("\t"+mt3[i][j]);
				
			}
			System.out.print("\n");
		}
		
		
		
		
		
	}
}
