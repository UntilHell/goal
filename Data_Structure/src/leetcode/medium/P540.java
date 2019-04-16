package leetcode.medium;

public class P540 {

	public int singleNonDuplicate(int[] nums) {
    
		/**
		 * 	��� 0 1 2 3 4 5 6
			���� X X X X X X X
			��ʱleft = 0, right = 6, mid = left + parseInt((right - left) / 2) = 3
			mid���˶���������ֵ
			��nums[mid] == nums[mid+1]ʱ���Ҳ��ʱ�ͻ�ʣ��ż����ֵ�����ֻ����һ�ε����ֲ���������Ҳ�
			��֮��nums[mid] == nums[mid-1]ʱ�����ͻ�ʣ��ż����ֵ�����ֻ����һ�ε����ֲ�����������
			
			��� 0 1 2 3 4
			���� X X X X X
			��ʱleft = 0, right = 4, mid = left + parseInt((right - left) / 2) = 2
			mid���˶���ż����ֵ
			��nums[mid] == nums[mid+1]ʱ���Ҳ��ʱʣ��������ֵ�����ֻ����һ�ε���һ�������Ҳ�
			��֮��nums[mid] == nums[mid-1]ʱ�����ʣ��������ֵ�����ֻ����һ�ε���һ���������
		 */
		
		int left = 0, right = nums.length-1;
		while(left < right){
			int mid = (left + right) / 2;
			if(mid % 2 == 1) mid--; //���ҵ�����������
			if(nums[mid] == nums[mid+1]){
				left = mid + 2;
			}else{
				right = mid;
			}					
		}
        return nums[left];		
    }	
}
