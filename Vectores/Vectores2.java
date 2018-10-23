package Vectores;
import java.util.*;
public class Vectores2 {

	static int Arreglo[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //Van como staic fuera del Main y solo Van como Int, cuando
	static int i;									  // dentro del public static void main.... Sino solo Int
	static int suma = 0;
	
	public static void main(String args[]) {
		//Despliegue de Elementos del Vector
		
		for (i=0; i<10; i++) {
			
			if(Arreglo[i]%2 == 0) {
				
			suma += Arreglo[i];
			
			System.out.print("\nEl Elemento es: "+Arreglo[i]);
			
			}
			else {
				
				System.out.print("\nEl Elemento es: "+Arreglo[i]);
				
			}
			
			//
			
		}
		
		System.out.print("\n\nLa Suma de Pares es: "+suma);

	}
}
