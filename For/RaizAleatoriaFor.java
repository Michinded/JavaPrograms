package For;
import java.util.*;

public class RaizAleatoriaFor {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		float raiz, Rand;
		int cam, cam2;
		
		System.out.print("Contador	Numero	Raiz");
		for(int i=0; i<1000; i++) {
			
			//System.out.print("******************************************************************************");
			
			Rand = (float) Math.random()*1000;
			
			raiz = (float)Math.sqrt(Rand);
			
			cam2 = (int) Rand;
			
			//cam = (int) raiz;
			
			System.out.print("\n\n\t"+i+"\t "+cam2+"\t "+raiz);
			
			//System.out.print("\n\n\n");
			
		}
		
	}
}
