package nestedForLoops;
import java.util.Scanner;

public class MorePatterns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			if( i <= 1) {
				System.out.println("0");
			}else {
			for(int j=n;j<=n-i+1; j--) {
				System.out.print(j + " ");
			}
			}

	
			System.out.println();
			
		}
			
		

	}

}
