package oncemore;

import java.util.ArrayList;
import java.util.List;


public class P077 {
	/**
	 * 
	»áÖØ¸´
	 List<List<Integer>> ans = new ArrayList<>();
	 boolean marked[] = null;
	 public List<List<Integer>> combine(int n, int k) {
		 marked = new boolean[n+1];
		 if(n == 0 || k == 0 || n < k){
			 return ans;
		 }
		 generateCombination( n, k, new ArrayList<Integer>());
		 return ans;
		 
	 }
	 private void generateCombination(int n, int k, ArrayList<Integer> p) {
		 
		 if(p.size() == k){
			 ans.add((List<Integer>) p.clone());
			 return;
		 }
		 for(int i = 1; i <= n; i++){
			 if(!marked[i]){
				 p.add(i);
				 marked[i] = true;
				 generateCombination(n,k,p);
				 marked[i] = false;
				 p.remove(p.size()-1);
			 }
		 }
		 
	 }
	  */
	
	 List<List<Integer>> ans = new ArrayList<>();
	 //boolean marked[] = null;
	 public List<List<Integer>> combine(int n, int k) {
		 //marked = new boolean[n+1];
		 if(n == 0 || k == 0 || n < k){
			 return ans;
		 }
		 generateCombination( n, k, 0,new ArrayList<Integer>());
		 return ans;
		 
	 }
	 private void generateCombination(int n, int k,int start, ArrayList<Integer> p) {
		 
		 if(p.size() == k){
			 ans.add((List<Integer>) p.clone());
			 return;
		 }
		 for(int i = start; i <= n; i++){
			 //if(!marked[i]){
				 p.add(i);
			//	 marked[i] = true;
				 generateCombination(n,k,i+1,p);
			//	 marked[i] = false;
				 p.remove(p.size()-1);
			 //}
		 }
		 
	 }
}
