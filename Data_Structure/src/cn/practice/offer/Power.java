package cn.practice.offer;

import org.junit.Test;

/**
 * ����һ��double���͵ĸ�����base��int��
 * �͵�����exponent����base��exponent�η���
 * @author Administrator
 *
 */
public class Power {

	public double power(double base, int exponent)  {
        if(base == 0 && exponent >= 0){
        	return 0;
        }
        if(base == 0 && exponent < 0){
        	try {
				throw new Exception("�������");
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
        
        if(exponent < 0){
        	return 1 / multi(base,-exponent);
        }
        return multi(base,exponent);
	}
	
	
	public double multi(double base,int exponent){
		double result = 1;
		for(int i = 0; i < exponent; i++){
			result *= base;
		}
		return result;
	}
	
	@Test
	public void testMulti(){
		System.out.println(power(3,2));
		System.out.println(power(3,2));
		System.out.println(power(3,2));
	}
	
}
