package questions;

public class HackerRankCandiesQues {

	int n;
	int sum =0;
	int a[] = new int [n];
	
	for(int i=1; i<n ; i++) {
		if(a[i] > a[i-1] ){
			a[i]= a[i-1] +1;
		}
	}
	for(int i=n-2 ;i>=0 ;i--) {
		if(a[n-2] >a[n-1]) {
			a[n-2] = maxOf(a[n-2], a[n-1]) +1;
		}
	}
	for(int i=0 ; i<n ;i++) {
		sum = sum + a[i];
	}
	System.out.println(sum);
}

 