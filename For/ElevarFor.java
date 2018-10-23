package For;
import java.util.*;

public class ElevarFor {

	public static void main(String args[]){
		double num = 0;
		
		for(int i = 0; i <= 1000; i++) {
			
			num = Math.pow(i, 2);
			
			System.out.print("\nNumero elevado al cuadrado: "+i+": "+num);
		}
		
		System.out.print("\n\nFinish");
	}
}
