package Vectores;
import java.util.*;

public class MetodoBurbuja2 {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int A[] = new int [15];
		int aux;
		for(int i = 0; i<10; i++) {
		
			System.out.print("\nIngrese los valores del Arreglo ["+i+"]: ");
			A[i] = kb.nextInt();
			
			//A[i] = i *5;
		}
		
		for(int i = 0; i<10; i++) {
			
			for (int j = 0; j<10; j++) {
				
				if(A[j] < A[j+1]) {
					
					aux = A[j+1];
					
					A[j+1] = A[j];
					
					A[j] = aux;
				}
				
			}
		}
			
			System.out.print("\n\n");
			
			
		
		for(int i = 0; i<10; i++) {
			
			System.out.print("\n"+A[i]);
			
			
		}
		
	}
}
