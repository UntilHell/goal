package practice.zhaoyin;

import java.util.Scanner;

public class P01 {

//	 public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         while(sc.hasNext()) {          
//            int n = sc.nextInt();
//            int[] arr = new int[n + 1];
//            for (int i = 1; i <= n; i++) {
//                arr[i] = sc.nextInt();         
//            }
//            int result =  maxProfit(arr);
//            System.out.println(result);
//        }
//         sc.close();
//        
//    }
//    
//    public static int maxProfit(int nums[]){
//        int n = nums.length;
//        int dp[] = new int[n];
//        dp[0] = 0;
//        dp[1] = 0;
//        for(int i = 2; i < n; i++){
//            dp[i] = Math.max(nums[i] - min(nums,i -2),dp[i-1]);
//        } 
//        return dp[n-1];
//    }
//
//    private static int min(int[] arr ,int r){
//        int min = 0;
//        for(int i = 0; i < r; i++){
//            if(min > arr[i]){
//                min = arr[i];
//            }
//        }
//        return min;
//    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt(), max = 0;
        int temp;
        while (scanner.hasNext()) {
            temp = scanner.nextInt();
            max = Math.max(max, temp - min);
            min = Math.min(min, temp);
        }
        System.out.println(max);
    }
}
