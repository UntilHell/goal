package recursion;

public class P1 {

	//�����ӡ�ַ���
	
	public void  printReverse(char [] str){
		helper(0,str);
	}
	
	public void helper(int index,char [] str){
		if(str == null || index >= str.length){
			return ;
		}
		helper(index + 1, str);
		System.out.println(str[index]);
		
	}
}
