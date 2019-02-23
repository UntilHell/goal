package cn.practice.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Easy_771 {

	 public static int numJewelsInStones(String j, String s) {
		 int count = 0;
		 char[] c = j.toCharArray();
		 List<Character> list = new ArrayList<>();
		 for(int i = 0; i < c.length; i++){
			 list.add(c[i]);
		 }
		 char[] ss = s.toCharArray();
		 for(int i = 0; i < ss.length ; i++){
			 if(list.contains(ss[i])){
				 count ++;
			 }
		 }
		 return count;
	 }
//	 "aA"
//	 "aAAbbbb"
	 public static void main(String[] args) {
		String j = "aA";
		String s = "aAAbbbb";
		System.out.println(numJewelsInStones( j,s));
		
	}
}
