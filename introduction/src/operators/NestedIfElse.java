package operators;

public class NestedIfElse {

	public static void main(String[] args) {
		 
		int a = 12 , b=2 , c=8;
		int result = 0;
		
//		if(a>b){
//			if(a>c) {
//				result = a;
//			} else {
//				result = c;
//			}
//			
//		} else {
//			if(b>c) {
//				result = b;
//			} else {
//				result = c;
//			}
//		}
		
		result = a>b ? a>c ? a:c:b>c ? b:c;
		
		System.out.println("the largest of the three numbers is " + result);
	}

}
