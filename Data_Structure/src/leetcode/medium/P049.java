package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class P049 {

	/**
	 public List<List<String>> groupAnagrams(String[] strs) {
		 ArrayList<String> list = new ArrayList<>();
		 List<List<String>> wrapList = new ArrayList<>();
		 String[] sortStrs = new String[strs.length];
		 for (int i = 0; i < strs.length; i++) {
			 char[] charArray = strs[i].toCharArray();
			 Arrays.sort(charArray);			
			 sortStrs[i]=new String(charArray);
		 }
		 for (int i = 0; i < sortStrs.length; i++) {
			 if(strs[i] == null) continue;
			 list.add(strs[i]);
			 for (int j = i+1; j < sortStrs.length; j++) {
				 if(sortStrs[i].equals(sortStrs[j])){
					 list.add(strs[j]);
					 strs[j] = null;
				 }
			 }
			 wrapList.add((List<String>) list.clone());
			 list.clear();
		 }
		 return wrapList;
		 
	 }
	 **/
	
	 public List<List<String>> groupAnagrams(String[] strs) {
		 if(strs.length == 0) return new ArrayList<>();
		 Map<String,List> map = new HashMap<>();
		 for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if(!map.containsKey(key)){
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
		return new ArrayList(map.values());
	 }
	 
}
