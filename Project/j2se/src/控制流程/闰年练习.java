package 控制流程;

import java.util.Scanner;

public class 闰年练习 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入年份");
		int a = s.nextInt();
		
//		if (a%4 == 0 && a % 100 != 0){ //用取模算数符%（取余）, 判断等于==， 判断不等于!=
//			System.out.println(a+"是闰年");
//		} else if(a % 400 == 0){
//			System.out.println(a+"是闰年");
//		} else {
//			System.out.println(a+"不是闰年");
//		}
		if (a<0){
			System.out.println("请输入公元年份");
		}
		
		if ((a % 4 == 0 && a % 100 != 0)||(a == 400)){
			System.out.println(a + "是闰年");
		} else{
			System.out.print(a + "不是闰年");
		}
	}
}
