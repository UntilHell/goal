package offer;

public class NumberOf1 {

	 public static int NumberOf1_CanNotUse(int n) {
        int count = 0;
        while (n != 0) {
            /*
            * ��1��n����λ�����㣬
            * ���Ҫ��Ϊ1����n��2������ʽ
            * ���ұ���λ�϶���1������Ϊ0
            */
            if ((n & 1) == 1) {
                count++;
            }
            //��n��2������ʽ������һλ
            n = n >> 1;
        }
        return count;
    }
	 
	 public static void main(String[] args) {
		System.out.println(NumberOf1_CanNotUse(44));
		System.out.println(5 & 1);
		System.out.println(4 & 1);
		System.out.println(10 & 1);
	}
}
