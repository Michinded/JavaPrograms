package Vectores;
import java.util.*;

public class Vectores {
	static int Arreglo[] = {2, 4, 6, 8, 10}; //Van como staic fuera del Main y solo Van como Int, cuando
	static int i;									  // dentro del public static void main.... Sino solo Int
	static int suma = 0;
	
	public static void main(String args[]) {
		//Despliegue de Elementos del Vector
		
		for (i=0; i<5; i++) {
			
			suma += Arreglo[i];
			
			System.out.print("\nEl Elemento es: "+Arreglo[i]);
			
		}
		
		System.out.print("\n\nSuma: "+suma);

	}

}
