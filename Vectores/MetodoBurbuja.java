package Vectores;
import java.util.*;

public class MetodoBurbuja {

	public static void main(String args[]) {
	
		Scanner kb = new Scanner(System.in);
		int i, j, aux;
		float ran;
		int A[] = new int [10];
		int A2[] = new int [10];
		
		
		for (i=0; i<10; i++) {
			
			ran = (float) Math.random()*10+1;
			
			A[i] = (int) ran;
			
			System.out.print("\nArreglo ["+i+"]: "+A[i]);
			
			
		}
		
		
		System.out.print("\n\n\n");
		
		for(i=1; i<10; i++){
			
			for(j=0; j<10-i; j++){
				
				if(A[j]>A[j+1]){
				    
					aux    = A[j+1];
					
					A[j+1] = A[j];
					
					A[j]   = aux;
				}
			}
			
		}
		
		for (i=0; i<10; i++) {
			
			System.out.print("\nArreglo Ordenado Menor a Mayor: "+A[i]);
			A2[i] = A[i];
			
		}
		
		/*
		System.out.print("\n\n\n");
		
		
		Esta funcion aun no se encuentra corregida, (La funcion esperada es Ordenar de Mayor a Menor)
		for(i=11; i<=0; i--) {
			
			System.out.print("\nArreglo Ordenado Mayor a Menor: "+A[i]);
			
		}
		*/
		
		
	}
}

