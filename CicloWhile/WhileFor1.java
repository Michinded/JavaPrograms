package CicloWhile;
import java.util.*;

public class WhileFor1 {
	
	public static void main(String args[]) {
		int mul=0, n1 = 0, n2 = 0, r = 0;
		
		while(mul < 10) {
			
			n1 += 5;
			n2 += 4;
			
			r += n1 * n2;
			
			System.out.print("\n\t "+n1+" x \t"+n2);
			System.out.print("\nR= "+r);
			
			mul++;
			
			//Esto es la multiplicacion de numeros en For
			//Recuerda buscar y pasar el resto de los For a While
		}
		System.out.print("\nTotal R= "+r);
		
	}
}
