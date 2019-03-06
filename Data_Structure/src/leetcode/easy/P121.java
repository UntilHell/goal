package leetcode.easy;

public class P121 {

	  public int maxProfit(int[] prices) {
		
		  int r = prices.length - 1;
		  int max = 0;
		 
		  for (int i = r; i > 0; i--) {
			  for (int j = 0; j < i; j++) {
					
					max = Math.max(prices[i] - prices[j], max);
				}
		  }
		  if(max < 0){
			  return 0;
		  }
		  return max;
	  }
}
