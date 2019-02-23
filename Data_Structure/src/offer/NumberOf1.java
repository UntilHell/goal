package offer;

public class NumberOf1 {

	 public static int NumberOf1_CanNotUse(int n) {
        int count = 0;
        while (n != 0) {
            /*
            * 用1和n进行位与运算，
            * 结果要是为1则是n的2进制形式
            * 最右边那位肯定是1，否则为0
            */
            if ((n & 1) == 1) {
                count++;
            }
            //把n的2进制形式往右推一位
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
