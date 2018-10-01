
import java.util.*;

public class Cronometro {

	public static void main(String args[]) {
		int min = 0, seg = 0, LimitMin, LimitSeg, Opcion;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Desea ejecutar Cronometro o Temporizador?\n");
		System.out.print("\n1: Para Cronometro");
		System.out.print("\n2: Para Temporizador");
		System.out.print("\n\nOpcion: ");
		Opcion = teclado.nextInt();
		
		if(Opcion==1) {
		
			System.out.print("\n\nCual es su limite de Minutos? ");
			LimitMin = teclado.nextInt();
			
			System.out.print("\n\nCual es su limite de Segundos? ");
			LimitSeg = teclado.nextInt();
		
		for (min=0; min<60; min++) {
			
			for (seg = 0; seg<60; seg++) {
				
				System.out.println(min+" : "+seg);
				delaySegundos();
				
				
				if(LimitMin==min && LimitSeg==seg) {
					System.exit(0);
				}
			  }
			
			
		 }
		
		}
		if(Opcion==2) {
			
			System.out.print("\n\nCual es su limite de Minutos: ");
			LimitMin = teclado.nextInt();
			
			System.out.print("\n\nCual es su limite de Segundos: ");
			LimitSeg = teclado.nextInt();
		
		for (min=LimitMin; min>=0; min--) {
			
			
			
			for (seg = LimitSeg; seg>0; seg--) {
				
				System.out.println(min+" : "+seg);
				delaySegundos();
				
			}
			if(seg==0) {
				LimitSeg = 60;
			} 
			
			if(min<=0) {
				System.exit(0);
			}   
		}
			
		}
		
		
	}
	
	private static void delaySegundos() {
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
	}
}
