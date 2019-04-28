package 控制流程;

import java.util.Scanner;

public class While练习 {

	public static void While(int n){ //定义n是int类型数据
		int sum = n; //阶乘总和放置在sum中
		while(n>1){
			n--; //阶乘是N*(N-1)*(N-2)*...*1,所以是先取值n，然后循环-1
			sum*=n; //sum = sum*n，将乘积结果赋予sum
		}
		System.out.println("阶乘是："+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = s.nextInt();
		While(a); //将从用户输入的数据传递给While
	}

}
