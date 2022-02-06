package strings;

public class OptimizedAnagram {

	public static void main(String[] args) {
		
		String a = "aab";
		String b = "aba";
		
		boolean isAnagram = true;
		
		int al[] = new int[256];
//		int bl[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
			}
		for(char c: b.toCharArray()) {
			int index = (int) c;
//			bl[index]++;
			al[index]--;
		}
		
		for(int i=0; i<256; i++) {
			if(al[i] != 0) {
				isAnagram =false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("it is anagram");
		}else {
			System.out.println("it is not anagram");
		}
		

	}

}
