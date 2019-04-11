package leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P279 {

	 public int numSquares(int n) {
		 
//		 Queue<Integer> queue = new LinkedList<>();
//		 List<Integer> squares = generateSquares(n);
//		 boolean mark[] = new boolean[n+1];		 
//		 queue.add(n);
//		 int levelNum = 0;
//		 int size = queue.size();
//		 while(size-- > 0){
//			 levelNum++;
//			 int c = queue.poll();
//			 
//			 for (Integer square : squares) {
//				 int next = c - square;
//				 if(next == 0){
//					 break;
//				 }
//				 if(next < 0){
//					 continue;
//				 }
//				
//				 mark[next] = true;
//				 queue.add(next);
//				 size = queue.size();
//			}
//		 }
//		 return levelNum;
		 //--------------------------
		 List<Integer> squares = generateSquares(n);
		 boolean mark[] = new boolean[n+1];
		 Queue<Integer> queue = new LinkedList<>();
		 queue.add(n);
		 mark[n] = true;
		 int level = 0;
		 while(!queue.isEmpty()){
			 int size = queue.size();
			 level++;
			 while(size-- > 0){
				 int c = queue.poll();
				 for(Integer square:squares){
					 int next = c - square;
					 if(next < 0){
						 break;
					 }
					 if(next == 0){
						 return level;
					 }
					 if(mark[next]){
						 continue;
					 }
					 mark[next] = true;
					 queue.add(next);
				 }
			 }
		 }
		 return level;
	 }
	 
	 private List<Integer> generateSquares(int n){
		 List<Integer> list = new ArrayList<>();
		 for (int i = 1; i * i <= n; i++) {
			list.add(i*i);
		 }
		 return list;
	 }
	 
	public static void main(String[] args) {
		int count = new P279().numSquares(4);
		System.out.println(count);
	}
	 
}
