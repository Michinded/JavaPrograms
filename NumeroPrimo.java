package Packs;

import java.util.*;

public class NumeroPrimo {

	public static void main(String args[]) {
		
		int n, estado = 1, num = 3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de numeros primos: ");
		n = teclado.nextInt();
		
		if (n<=1) {
			System.out.print("\n\nPrimer: "+n+"\nLos primos son: ");
			System.out.println(2);
			
		}
		else {
		System.out.print("1\n");
		
		for (int count =2; count<=n;) {
			for (int j=2; j <= Math.sqrt(num); j++) {
				
				if(num%j==0) {
					estado = 0;
					break;
				}
			}
			if(estado!=0) {
				System.out.println(num);
				count++;
			}
			estado = 1;
			num++;
		}
		    }
	
	}
}
