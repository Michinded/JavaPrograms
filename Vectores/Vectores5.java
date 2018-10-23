package Vectores;
import java.util.*;

public class Vectores5 {

	public static void main(String args[]) {
		int Arreglo1[] = new int [1000];
		
		for (int i = 0; i<1000; i++) {
			
			Arreglo1[i] = i;
			
		}
		
		System.out.print("\n\n*********** Despliegue del Vector ***********\n\n");
		
		for(int j = 0; j<1000; j++) {
			
			System.out.print("\n"+Arreglo1[j]);
		}
	}
}
