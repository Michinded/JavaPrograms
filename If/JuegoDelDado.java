package If;
import java.util.*;
public class JuegoDelDado {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num, rand;
		
		System.out.print("Bienvenido al juego del Dado!!!");
		 do {
		System.out.print("\n\nIngrese un numero: ");
		num = kb.nextInt();
		
		if(num > 6 || num < 0) {
			
			System.out.print("El N�mero Ingresado no existe en un Dado!!");
			
			System.exit(0);
		}
		
		else {
		rand = (int) (Math.random()*6+1);
		
		
		System.out.print("\n\nVeamos si Ganas\n");
		
		if (rand == num) {
			
			System.out.print("\n\nFelicidades has Ganado, lograste Adivinar el numero!!!");
			System.out.print("\nTu n�mero Ganadorfue: "+rand);
		}
		else {
			System.out.print("\n\nSuserte Para la Proxima");
			System.out.print("\n\nEl Numero que cayo Fue: "+rand);
		}
		
		
		}
		
		 }while (num!=0);

	}

}
