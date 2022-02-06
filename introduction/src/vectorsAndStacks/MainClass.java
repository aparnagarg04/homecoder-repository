package vectorsAndStacks;


//import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		Vector<Integer> v = new Vector();
//		
//		v.add(524);
//		v.add(9);
		
		MyStack<Integer> stack = new MyStack<>();
		
//		stack.push(12);
//		stack.push(24);
//		stack.push(85);
//		
		int popped = stack.pop();
		
		System.out.println(popped);
		

		int peeked = stack.peek();
		System.out.println(peeked);

	}

}
