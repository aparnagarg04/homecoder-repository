package loops;
import java.util.Scanner;

public class XraisedToThePowerY {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int result = 1;
//		
//		for (int i = 0; i<b; i++) {
//			result *= a;
//		}
//		
//		System.out.println(result);
//		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean isPrime = true;
		
		for (int i = 2; i*i <= n; i++ ) {
			
			if(n % i ==0) {
				isPrime = false;
				break;
			}
			
		}
		
		if(n < 2) {
			isPrime = false;}
		
		System.out.println("isPrime " + isPrime);
		
		
		

	}

}
