package leetcode.medium;



public class P744 {

	public char nextGreatestLetter(char[] letters, char target) {
        
		
		 int a[] = new int[letters.length];
		 for (int i = 0; i < letters.length; i++) {
			
			a[i] = letters[i] - target;
			 if(a[i] > 0) return letters[i];	
		 }
		
		 return letters[0];
    }
}
