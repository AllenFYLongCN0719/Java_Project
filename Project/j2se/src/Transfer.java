
public class Transfer {
	public static void main(String[] args) {
		char c1 = 'A';
		short s = 80;
		
		//虽然short和char都是16位长
		//但是彼此之间，依然需要强制转换
		c1 = (char) s;
		
		byte b1 = 5;
		int i1= 10;
		int i2 = 300;
		
		b1 = (byte) i1;
		//因为i1的值是在byte范围之内的，所以即便是进行强制转换
		//最后得到值，也是10
		System.out.println(b1);
		
		//因为i2的值是在byte范围之外的，所以就会按照byte的长度进行截取
		//i2的值是300，其对应的二进制数是100101100
		//按照byte的长度，8位进行截取后，其值为00101100即为44
		b1 = (byte) i2;
		System.out.println(b1);
		
		//查看一个整数对应的二进制的方法：
		System.out.println(Integer.toBinaryString(i2));
		
		short a = 1;
		short b = 2;
		//short c = a+b //会报错 a+b无法放入short c中
		short c = (short)(a+b); //对a+b进行整体强制转换
		System.out.println(c);
		System.out.println(a+b);//计算过程会对类型自动转换 默认int
	}
}
