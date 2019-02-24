package leetcode.easy;

import org.junit.Test;

public class P338 {

	 public int[] countBits(int num) {
       int result[] = new int[num+1]; 
        for(int i=0;i<=num;i++){
            result[i] = count(i);
        }
        return result;
	 }
    public int count(int num){
        int count = 0;
        while(num != 0){
            count++;
            num = (num-1) & num;
        }
        return count;
    }
    
    @Test
    public void test(){
    	
    	int[] countBits = countBits(2);
    	for (int i = 0; i < countBits.length; i++) {
			int j = countBits[i];
			System.out.println(j);
		}
    }
	    
	    
	    
	    
}
