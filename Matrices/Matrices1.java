package Matrices;

import java.util.*;

public class Matrices1 {

	public static void main(String args[]) {
		
		int matrix [][] = new int [5][5];
		int c = 0;
		
		for (int i=0; i<5; i++) {
			
			for (int j=0; j<5; j++) {
				
				c += 1;
				
				matrix[i][j] = c;
				
				System.out.print("\t"+matrix[i][j]);
				
			}
			
			System.out.print("\n");
		}
		
	}
}
