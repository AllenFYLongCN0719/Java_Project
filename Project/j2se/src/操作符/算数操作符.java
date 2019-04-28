package 操作符;
import java.util.Scanner; //导入scanner类，使其可以从控制台输入数据

public class 算数操作符 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("第一个整数是："+a);
		int b = s.nextInt();
		System.out.println("第二个整数是："+b);
		float c = a+b;
		System.out.println("两个数之和是："+c);
		
		//如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算 
		int d = 5;
		long e = 6;
		int f = (int)(a+b); //a+b的运算结果是long型，所以要进行强制转换
		long g = d+e;
		
		//如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算 
		byte h = 1;
		byte j = 2;
		byte k = (byte)(a+b);//运算结果是int类型，需要进行强制转换
		
		//%取余数，又叫取模
		int i = 5;
		int ii = 2;
		System.out.println(i%j);//输出为1
		
		//++，-- 在原来的基础上增加1或者减少1
		int X = 5;
		X++;
		System.out.println(X);//输出为6
		
		int Z = 5;
		System.out.println(Z++);//输出5
		System.out.println(Z);//输出6
		
		int Z1 = 5;
		System.out.println(++Z1);//输出6
		System.out.println(Z1);//输出6
	}
}
