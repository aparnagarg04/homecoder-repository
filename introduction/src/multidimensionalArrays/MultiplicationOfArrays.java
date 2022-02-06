package multidimensionalArrays;

import java.util.Scanner;

public class MultiplicationOfArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the rows of matrix 1");
		int rows1 = sc.nextInt();
		
		System.out.println("enter the columns of matrix 1");
		int cols1 = sc.nextInt();
		int a[][] = new int[rows1][cols1];
		
		System.out.println("enter the rows of matrix 2");
		int rows2 = sc.nextInt();
		
		System.out.println("enter the cols of matrix 2");
		int cols2 = sc.nextInt();
		int b[][] = new int[rows2][cols2];
		
		if(cols1 != rows2){
			System.out.println("invalid");
		} else {
			
			System.out.print("enter the matrix 1");
			
			for(int i=0; i<rows1;i++) {
				for(int j=0; j<cols1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.print("enter the matrix 2");
			for(int i=0; i<rows2;i++) {
				for(int j=0; j<cols2; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<rows1;i++) {
				for(int j=0; j<cols1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			int sum = 0;
			int c[][] = new int[rows1][cols2];
			for(int i=0; i<rows1;i++) {
				for(int j=0; j<cols2; j++) {
					for(int k=0;k<cols1; k++) {
						sum = sum + a[i][k] * b[k][j];	
					c[i][j]= sum;
					System.out.print(c[i][j] + " ");
					}
				}
				System.out.println();
			}
			
			
			
		}

	}

}
