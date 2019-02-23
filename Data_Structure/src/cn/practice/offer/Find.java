package cn.practice.offer;


/*
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列
 * 都按照从上到下递增的顺序排序。请完成一个函
 * 数，输入这样的一个二维数组和一个整数，判断
 * 数组中是否含有该整数。
 */
public class Find {

	public boolean find(int target, int [][] array) {
       boolean found = false;
       if(array != null){
    	   int rows = array.length ;
           int columns =array[0].length - 1;
           int row = 0;
           int column = columns;
           while(row < rows && column >= 0){
        	   if(array[row][column] > target){
        		   column --;
        	   }else if(array[row][column] < target){
        		   row ++;
        	   }else{
        		   found = true;
        		   break;
        	   }
           }
       }
       return found;
    }
	
	
	
}
