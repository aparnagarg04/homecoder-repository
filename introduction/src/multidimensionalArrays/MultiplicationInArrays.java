package multidimensionalArrays;

import java.util.Scanner;

public class MultiplicationInArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the dimensions");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int a[][] = new int[rows][cols];
		int b[][] = new int[cols][rows];
		
		System.out.println("enter array a");
		for(int i=0; i <rows; i++) {
			for(int j=0; j<cols; j++) {
				a[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("enter array b");
		for(int i=0; i <cols; i++) {
			for(int j=0; j<rows; j++) {
				b[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("the multiplication of a and b");
		int c[][] = new int[rows][rows];
		for(int i=0; i <rows; i++) {
			for(int j=0; j<rows; j++) {
				c[i][j]= a[i][j]*b[i][j];	
			}
		}
		
		for(int i=0; i <rows; i++) {
			for(int j=0; j<rows; j++) {
				
				System.out.print(c[i][j] + " ");
			
				
			}
		}

	}

}
