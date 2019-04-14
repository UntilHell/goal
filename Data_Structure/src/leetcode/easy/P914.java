package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class P914 {

//	public boolean hasGroupsSizeX(int[] deck) {
//		if(deck == null || deck.length == 1) return false;
//		Arrays.sort(deck);
//		int temp = deck[0];
//		int count[] = new int[deck.length];
//		Arrays.fill(count, 0);
//		int k = 0;
//		for (int i = 1; i < deck.length; i++) {
//			if(deck[i] == temp){
//				count[k]++;
//			}else{
//				temp = deck[i];
//				k++;
//			}
//		}
//		
//		int result[] = new int[k];
//		int j =0;
//		for (int i = 0; i < k; i++) {
//			if(count[i] != 0)
//				result[j++]=count[i]+1;	
//		}
//		int min = result[0];
//		for (int i = 1; i < result.length; i++) {
//			
//			if(min < result[i]){
//				min = result[i];
//			}
//		}
//		for (int i = 0; i < result.length; i++) {
//			
//			if(result[i] % min != 0) return false;
//		}
//		return true;
//		
//    }
//	
//	public boolean hasGroupsSizeX(int[] deck) {
//		if(deck == null || deck.length == 1) return false;
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int i = 0; i < deck.length; i++) {
//			if(!map.containsKey(deck[i])){
//				map.put(deck[i], 1);
//			}else{
//				Integer count = map.get(deck[i]);
//				map.put(deck[i],  ++count);
//			}	
//		}
//		
//		int n = map.size();
//		int count[] = new int[n];
//		int k = 0;
//		for(Integer c : map.keySet()){
//			count[k++] = map.get(c);
//		}
//		
//		int min = count[0];
//		int max = count[0];
//		for (int i = 1; i < count.length; i++) {
//			
//			if(min > count[i]){
//				min = count[i];
//			}
//			if(max < count[i]){
//				min = count[i];
//			}
//		}
//		int gck = maxFactor(min,max);
//		if(gck == 1) return false;
//		for (int i = 0; i < count.length; i++) {
//			
//			if(count[i] % gck != 0) return false;
//		}
//		return true;
//	}
	
	public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0;
        for (int i : deck) count.put(i, count.getOrDefault(i, 0) + 1);
        for (int i : count.values()) res = gcd(i, res);
        return res > 1;
    }

    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
//	//求最小公约数
//	private int maxFactor(int a, int b){
//		if(b == 0){
//			return a;
//		}else{
//			return maxFactor(b, a % b);			
//		}
//	}
	
	@Test
	public void test(){
		
		//int arr[] = {1,1,2,2,2,2};
		int arr[] = {1,1,1,2,2,2,3,3};
		System.out.println(hasGroupsSizeX(arr));
	}
}
