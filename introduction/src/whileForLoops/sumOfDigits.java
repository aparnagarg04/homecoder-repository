package whileForLoops;
import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum =0;
		int digit = 0;
		
//		while(temp>0) {
//			int lastDigit = temp % 10;
//			temp /= 10;
//			
//			sum += lastDigit;
//			System.out.println(lastDigit+ " " + temp + " " + sum);
//		}
//		System.out.println("the sum of the digits of "+ n + "is" + sum);
//		
		int noOfDigits = (int)Math.log10(n)+1;
		for(int i=1; i<=noOfDigits; i++) {
			digit = temp%10;
			temp /=10;
		       
			sum += digit;
			
			
		}
		System.out.println(sum);
		
		
		
		

	}

}
