package 控制流程;

import java.util.Iterator;

public class 水仙花数 {
	public static void Math() {
		int Result = 0;
		int a = 0; //百位
		int b = 0; //十位
		int c = 0; //个位
		
		outloop:
		for (Result = 100; Result < 1000; Result++){
			a = Result / 100; //得出百位数字
			b = (Result - a * 100) / 10; //得出十位数字
			c = Result - a*100 - b*10; //得出个位数字
			
			if(Result == (Math.pow(a, 3))+(Math.pow(b, 3))+ (Math.pow(c, 3))){
				 System.out.println(Result);
				 //break;
			}
		}
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math();
	}

}
