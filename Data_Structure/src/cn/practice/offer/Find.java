package cn.practice.offer;


/*
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
 * ÿһ�ж����մ����ҵ�����˳������ÿһ��
 * �����մ��ϵ��µ�����˳�����������һ����
 * ��������������һ����ά�����һ���������ж�
 * �������Ƿ��и�������
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
