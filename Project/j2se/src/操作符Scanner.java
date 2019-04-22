import java.util.Scanner;//导入scanner类，使其可以从控制台输入数据

public class 操作符Scanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();//读取整数
		System.out.println("第一个整数："+a);
		int b = s.nextInt();
		System.out.println("第二个整数："+b);
		
		float f = s.nextFloat();//读取浮点数
		System.out.println("读取的浮点数是："+f);
		
		String S = s.nextLine();
		System.out.println("读取的字符串是"+S);
		
		//读取整数后，接着读取字符串
		int i = s.nextInt();
		System.out.println("读取的整数是"+i);
		//如果需要读取整数后接着读取字符串，就需要连续执行两次nextLine()
		//因为如果直接读取字符串，赌出来的会是回车换行（\r\n）,因为nextInt仅仅读取数字信息
		String rn = s.nextLine();//取走回车换行
		String S1 = s.nextLine();//读取真正的字符串
		System.out.println("读取的字符串是："+S1);
	}
}
