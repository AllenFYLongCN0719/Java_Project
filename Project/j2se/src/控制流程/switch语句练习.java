package 控制流程;

import java.util.Scanner;

public class switch语句练习 {
	public static void Jijie(){
	try{
		Scanner s = new Scanner(System.in);
		System.out.println("去输入月份：");
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
//			System.out.println("你写的是啥玩意儿？");
//		} 
		
		switch(a){
		case 3:
		case 2:
		case 1:
			System.out.println("春天");
			break;
		case 6:
		case 5:
		case 4:
			System.out.println("夏天");
			break;
		case 9:
		case 8:
		case 7:
			System.out.println("夏天");
			break;
		case 12:
		case 11:
		case 10:
			System.out.println("冬天");
			break;
		default:
			System.out.println("你写的是啥玩意儿？");
		}
	}catch (Exception e){ //这个可以判定输入的数是否是整数
			System.out.println("请输入整数");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jijie();
		
	}

}
