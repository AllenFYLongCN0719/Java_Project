package 控制流程;

import java.util.Scanner;

public class for循环 {
	public static void For(int F){
		int b = 5;
		if (F >= b || F < 0){
			System.out.println("输入的啥玩意儿");
		} else {
			for (int a = F; a < b; a++){
			System.out.println("for 循环输出的"+a);
		    }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		For(a);
	}

}
