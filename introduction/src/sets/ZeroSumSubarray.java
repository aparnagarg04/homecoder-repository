package sets;
import java.util.*;

public class ZeroSumSubarray {

	public static void main(String[] args) {
		
		int[] a = {2,3,1,6,4};
		boolean found = false;
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int element : a) {
			set.add(sum);
			sum += element;
			if(set.contains(sum)) {
				found = true;
				break;
			}
		}

	}

}
