package 操作符;
import java.util.Scanner;
public class 关系操作符 {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 5;
		
		//> 大于
		//>= 大于或等于
		//< 小于
		//<= 小于或等于
		//== 是否相等
		//!= 是否不等
		System.out.println(a>b); //返回false
		System.out.println(a>=c); //返回true
		
		System.out.println(a==b); //返回false
		System.out.println(a!=b); //返回true
		
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		System.out.println("第一个整数是："+d);
		
		int e = s.nextInt();
		System.out.println("第二个整数是："+e);
		
		System.out.println("比较"+d+'>'+e+':'+(d>e)); //这里(d>e) 编译器将会使其视为一个整体
		System.out.println("比较"+d+">="+e+':'+(d>=e));
		System.out.println("比较"+d+'<'+e+':'+(d<e));
		System.out.println("比较"+d+"<="+e+':'+(d<=e));
		System.out.println("比较"+d+"=="+e+':'+(d==e));
		System.out.println("比较"+d+"!="+e+':'+(d!=e));
	}
}
