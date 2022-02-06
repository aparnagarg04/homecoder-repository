package strings;

public class question {

	public static void main(String[] args) {
		
		String a ="I love java , the coffee";
		String b[] = a.split(" ");
		
		for(int i=b.length -1; i>=0 ;i--) {
			System.out.print(b[i] + " ");
		}
		
	}

}
