package leetcode.medium;

public class P011 {

	public int maxArea(int[] height){
		int maxarea = 0, l = 0, r = height.length -1;
		while(l < r){
			maxarea = Math.max(Math.min(height[l], height[r]) * (r - l), maxarea);
			if(height[l] < height[r]){
				l++;
			}else{
				r--;
			}
		}
		return maxarea;
	}
}
