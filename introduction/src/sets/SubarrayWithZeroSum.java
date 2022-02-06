package sets;

public class SubarrayWithZeroSum {
// solution by brute force method
	public static void main(String[] args) {
		
		int a[] = {2,4,5,6,1};
		boolean found = false;
		
		for(int i=0 ; i<a.length ; i++) {
			int sum= 0;
			for(int j=i ; j<a.length ; j++) {
				sum += a[j];
				if(sum ==0) {
					found = true;
					break;
				}
			}
			if(found) break;
		}
		System.out.println("found = " + found);
	}

}
