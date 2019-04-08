package leetcode.medium;

public class P200 {

	private int m, n;
	private boolean visited[][];
	private int d[][] = {{0,1},{1,0},{0,-1},{-1,0}};
	public int numIslands(char[][] grid) {
	 
		if(grid == null || grid.length == 0 || grid[0].length == 0){
			return 0;
		}
		
		m = grid.length;
		n = grid[0].length;
		
		visited = new boolean[m][n];
		
		int res = 0;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(grid[i][j] == '1' && !visited[i][j]){
					dfs(grid,i,j);
					res++;
				}
			}
		}
		return res;
    }
	
	//��grid[x][y]��λ�ÿ�ʼ������floodfill
	//��֤(x,y)�Ϸ�����grid[x][y]��û�б����ʵ�½��
	private void dfs(char[][] grid, int x, int y) {
		visited[x][y] = true;
		for(int i = 0; i < 4; i++){
			int newx = x + d[i][0];
			int newy = y + d[i][1];
			if(inArea(newx,newy) && !visited[newx][newy] && grid[newx][newy] == '1')
				dfs(grid, newx, newy);
		}
		return ;
	}

	private boolean inArea(int x, int y) {
		return x >= 0 && x < m && y >= 0 && y < n;
	}
	
	public static void main(String[] args) {

        char grid1[][] = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        System.out.println((new P200()).numIslands(grid1));
        // 1

        // ---

        char grid2[][] = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        System.out.println((new P200()).numIslands(grid2));
        // 3
    }
}
