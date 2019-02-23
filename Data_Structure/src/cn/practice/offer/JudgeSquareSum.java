package cn.practice.offer;

/**
 * 题目描述：判断一个数是否为两个数的平方和。
 * @author Administrator
 *
 */
public class JudgeSquareSum {

	 public boolean judgeSquareSum(int c) {
		 int h = (int) Math.sqrt(c);
		 int l = 1 ;
		 while(l <= h){
			 int sum = l * l + h * h;
			 if(sum == c){
				 return true;
			 }else if(sum > c){
				 h --;
			 }else{
				 l ++;
			 }
		 }
		 return false;
	 }
}
