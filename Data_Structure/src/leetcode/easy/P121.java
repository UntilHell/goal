package leetcode.easy;

public class P121 {

//	  public int maxProfit(int[] prices) {
//		
//		  int r = prices.length - 1;
//		  int max = 0;
//		 
//		  for (int i = r; i > 0; i--) {
//			  for (int j = 0; j < i; j++) {
//					
//					max = Math.max(prices[i] - prices[j], max);
//				}
//		  }
//		  if(max < 0){
//			  return 0;
//		  }
//		  return max;
//	  }
	
	 public int maxProfit(int[] prices) {
	     
		 if(prices.length == 0 || prices.length ==1){
			 return 0;
		 }
		 
		 int maxProfit = 0 ;
		 int minProfit = prices[0];
		 for (int i = 0; i < prices.length; i++) {
			 minProfit = Math.min(minProfit, prices[i]);
			 maxProfit = Math.max(maxProfit, prices[i] - minProfit);
		 }
		 
		 return maxProfit;
		 
		 
		 
	 }
}
