package ��������;

import java.util.Iterator;

public class ˮ�ɻ��� {
	public static void Math() {
		int Result = 0;
		int a = 0; //��λ
		int b = 0; //ʮλ
		int c = 0; //��λ
		
		outloop:
		for (Result = 100; Result < 1000; Result++){
			a = Result / 100; //�ó���λ����
			b = (Result - a * 100) / 10; //�ó�ʮλ����
			c = Result - a*100 - b*10; //�ó���λ����
			
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
