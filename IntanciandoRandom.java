import java.util.*;

public class IntanciandoRandom {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num;
		
		num = (int) (Math.random()*(20-10+1)+10);
		
		System.out.print("Aletorio: "+num);
	}

}
