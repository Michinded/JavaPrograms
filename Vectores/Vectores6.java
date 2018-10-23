package Vectores;
import java.util.*;

public class Vectores6 {

	public static void main(String args[]) {
		
		int Arreglo2[] = new int [1000];
		float num;
		
		System.out.print("\n\n*********** Despliegue del Vector Random ***********\n\n");
		
		for (int i = 0; i<1000; i++) {
			
			num = (float) Math.random()*1000;
			
			Arreglo2[i] = (int) num;
			
			System.out.print("\n"+Arreglo2[i]);		
		}
		
		
		
		
	}
}
