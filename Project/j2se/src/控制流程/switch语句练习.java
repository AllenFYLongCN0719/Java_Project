package ��������;

import java.util.Scanner;

public class switch�����ϰ {
	public static void Jijie(){
	try{
		Scanner s = new Scanner(System.in);
		System.out.println("ȥ�����·ݣ�");
		int a = s.nextInt();
//		if (a > 0 && a < 4){
//			a = 3;
//		} else if (a >= 4 && a < 7 ){
//			a = 6;
//		} else if (a>=7 && a < 10){
//			a = 9;
//		} else if (a>=10 && a <= 12){
//			a = 11;
//		} else if (a <= 0 || a > 12){
//			System.out.println("��д����ɶ�������");
//		} 
		
		switch(a){
		case 3:
		case 2:
		case 1:
			System.out.println("����");
			break;
		case 6:
		case 5:
		case 4:
			System.out.println("����");
			break;
		case 9:
		case 8:
		case 7:
			System.out.println("����");
			break;
		case 12:
		case 11:
		case 10:
			System.out.println("����");
			break;
		default:
			System.out.println("��д����ɶ�������");
		}
	}catch (Exception e){ //��������ж���������Ƿ�������
			System.out.println("����������");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jijie();
		
	}

}
