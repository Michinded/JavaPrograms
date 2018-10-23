package Matrices;

public class Matrices2 {

	public static void main(String args[]) {
		
		int mtx1[][] = new int [5][5];
		
		int mtx2[][] = new int [5][5];
		
		int mtx3[][] = new int [5][5];
		
		int i, j, aux = 10;
		
		for(i=0; i<5; i++) {
			
			for(j=0; j<5; j++) {
				
				mtx1[i][j] = aux;
				mtx2[i][j] = aux;
				
				mtx3[i][j] = mtx1[i][j] * mtx2[i][j];
			}
			
		}
		
		// Muestra Mtrz1;
		
		for(i=0; i<5; i++) {
			
			for (j=0; j<5; j++) {
				
				System.out.print("\t"+mtx1[i][j]);
				
			}
			
			System.out.print("\n");
		}
		
		System.out.print("\n\n\n");
		
		//Muestra Mtrz 2
		
		for(i=0; i<5; i++) {
			
			for (j=0; j<5; j++) {
				
				System.out.print("\t"+mtx2[i][j]);
			}
			
			System.out.print("\n");
		}
		
		System.out.print("\n\n\n");
		
		//Mustra Multilplicacion
		
		for(i=0; i<5; i++) {
			
			for (j=0; j<5; j++) {
				
				System.out.print("\t"+mtx3[i][j]);
				
			}
			
			System.out.print("\n");
		}
		
	}
}
