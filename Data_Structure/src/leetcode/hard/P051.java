//package leetcode.hard;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class P051 {
//
//	private boolean[] col;
//	private boolean[] dia1;
//	private boolean[] dia2;
//	private ArrayList<List<String>> res;
//	public List<List<String>> solveNQueens(int n) {
//	
//		res = new ArrayList<List<String>>();
//		col = new boolean[n];
//		dia1 = new boolean[2*n-1];
//		dia2 = new boolean[2*n-1];
//		LinkedList<Integer> row = new LinkedList<>();
//		putQueue(n,0,row);
//		return res;
//    }
//	private void putQueue(int n, int i, LinkedList<Integer> row) {
//		
//		if(index == n){
//			res.add(n)
//		}
//	}
//}
