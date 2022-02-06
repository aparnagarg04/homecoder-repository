package operators;

public class SwitchCase {

	public static void main(String[] args) {
		
//		int dayOfWeek=2;
//		switch(dayOfWeek) {
//		case 1: 
//	    case 2:
//			System.out.println("i m on leave");
//			break;
//		case 3:
//			System.out.println("i m  playing football");
//			break;
//			
//			default:
//				System.out.println("i dont know what day it is");
//			}
//				
		int rating = 3;
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("bad review");
			break;
		case 3:
			System.out.println("average review");
			break;
		case 4:
		case 5:
			System.out.println("good review");
			break;
		}

	}

}
