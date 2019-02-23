package offer;

import org.junit.Test;

public class RectCover {

	public int rectCover(int target) {

//		if(target == 1){
//			return 1;
//		}else if(target == 2){
//			return 2;
//		}else{
//			return rectCover(target-1) + rectCover(target-2);
//		}
		if(target == 1){
			return 1;
		}else if(target == 2){
			return 2;
		}
		int one = 1;
		int two = 2;
		int sum = 0;
		for(int i =0; i < target; i++){
			sum = one + two;
			two = sum;
			one = two;				
		}
		return sum;
    }
}
