package leetcode.medium;

public class P079 {

	private int m,n;
	private boolean[][] visited;
	private int d[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public boolean exist(char[][] board, String word) {
	    if(board == null || word == null){
	    	throw new IllegalArgumentException("board or word can not be null");
	    }
	    
	    m = board.length;
	    if(m == 0){
	    	throw new IllegalArgumentException("board or word can not be null");
	    }
	    n= board[n].length;
	    if(n == 0){
	    	throw new IllegalArgumentException("board or word can not be null");
	    }
	    visited = new boolean[m][n];
	    
	    for(int i = 0; i < m; i++){
	    	for(int j = 0; j < n; j++){
	    		if(searchWord(board,word,0,i,j)){
	    			return true;
	    		}
	    	}
	    }
	    return true;
    }
	private boolean searchWord(char[][] board, String word, int index, int startX, int startY) {
		 // 从board[startx][starty]开始, 寻找word[index...word.size())
		if(index == word.length() -1){
			return board[startX][startY] == word.charAt(index);
		}
		
		if(board[startX][startY] == word.charAt(index)){
			visited[startX][startY] = true;
			//从startX,startY出发，向四个方向寻找
			for(int i = 0; i < 4; i++){
				int newX = startX + d[i][0];
				int newY = startY + d[i][1];
				if(isArea(newX,newY) && !visited[newX][newY]
						&& searchWord(board,word,index+1,newX,newY)){
					return true;
				}
				
			}
			visited[startX][startY] = false;
		}
		return false;
	}
	private boolean isArea(int x, int y) {
		 return x >= 0 && x < m && y >= 0 && y < n;
	}
	
	
}
