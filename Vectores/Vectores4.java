package Vectores;
import java.util.*;
public class Vectores4 {

	static int Arreglo[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //Van como staic fuera del Main y solo Van como Int, cuando
	static int i;									  // dentro del public static void main.... Sino solo Int
	static int suma = 0;
	static int pares = 0;
	static int nones = 0;
	
	public static void main(String args[]) {
		//Despliegue de Elementos del Vector
		
		for (i=0; i<10; i++) {
			
			if(Arreglo[i]%2 == 0) {
				
			pares += Arreglo[i];
			//pares++;
			
			System.out.print("\nEl Elemento es: "+Arreglo[i]);
			
			}
			else {
				
				System.out.print("\nEl Elemento es: "+Arreglo[i]);
				nones += Arreglo[i];
				//nones++;
				
			}
			
			
			
		}
		
		suma += pares + nones;
		
		System.out.print("\n\nLa Suma de Pares es: "+pares);
		
		System.out.print("\nLa Suma de Nones es: "+nones);
		
		System.out.print("\n\nLa Suma de Pares y Nones es: "+suma);

	}
}
