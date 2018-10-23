package CicloWhile;
import java.util.*;

public class WhileRaiz {

	public static void main(String args[]) {
		float raiz;
		int cont = 0;
		while(cont <=1000) {
			
			raiz = (float) Math.sqrt(cont);
			
			System.out.print("\nLa raiz del Número "+cont+" es: "+raiz);
			
			cont ++;
		}
		
	}
}
