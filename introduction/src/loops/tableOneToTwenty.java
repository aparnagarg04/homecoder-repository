package loops;

public class tableOneToTwenty {

	public static void main(String[] args) {
		
		for(int j=1 ; j<=20; j++) {
			int tableOf = j;
			for(int i = 1; i<=10; i++) {
				System.out.print(tableOf * j + " ");
			}
			
			System.out.println();
			
		}

	}

}