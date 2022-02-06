package maps;
import java.util.*;
import java.util.Map.Entry;

//import java.util.HashMap;
//import java.util.Map;

public class MainClassMap {

	public static void main(String[] args) {
		
//		Map<String,Integer> numbers = new HashMap<>();
//		
//		numbers.put("one",1);
//		numbers.put("two",2);
//		numbers.put("three",3);
//		System.out.println(numbers.get("three"));
//		System.out.println(numbers.containsKey("four"));
//		System.out.println(numbers);
//		System.out.println(numbers.entrySet());
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.replace("one" ,1 , 4));
//		System.out.println(numbers.values());
//		
//		Set<Entry<String,Integer>> entries = numbers.entrySet();
//		
//		for(Entry<String,Integer> entry :entries) {
//			entry.setValue(entry.getValue()*100);
//		}
//		System.out.println(numbers);
		System.out.println(getHash("CAT"));
		System.out.println(getHash("god"));
		System.out.println(getHash("man"));
		System.out.println(getHash("dog"));
	}

	public static int getHash(String s) {
		int hash =0;
		for(int i=0; i< s.length();i++) {
			hash += s.charAt(i);
		}
		return hash;
	}
	
}
