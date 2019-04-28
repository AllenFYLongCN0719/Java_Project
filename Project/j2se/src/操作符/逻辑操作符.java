package 操作符;

public class 逻辑操作符 {
	public static void main(String[] args) {
		//长路与 和 短路与 
		//都为真时，才为真 任意为假，就为假
		
		//长路与& 无论第一个表达式的值是true或者false,第二个表达式都会被运算
		int i = 2;
		System.out.println(i == 1 & i++ == 2); //无论如何i++都会被执行，所以i的值变为3
		System.out.print(i);
		System.out.print('\r');
		
		//短路与&& 只要第一个表达式的值是false，第二个表达式的值，就不需要进行运算了
		//反之如果是true，第二个表达式的值则会进行计算
		int j =2;
		System.out.println(j == 2 && j++ == 2); //因为j==1返回false，所以右边的j++就没有执行了，所以j的值还是2
		System.out.println(j);
		System.out.print('\r');
		
		
		//长路或 和 短路或
		//都为假时，才为假 任意为真，就为真
		
		//长路或| 无论第一个表达式的值是true或者false,第二个的值，都会被运算
		int a = 2;
		System.out.println(a == 1| a++ == 2);//无论如何i++都会被执行，所以a的值是3
		System.out.println(a);
		//System.out.print('\r');
		
		//短路或|| 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
		int b = 2;
		System.out.println(b== 2 || b++ ==2);//因为b==2返回true，所以右边的b++就没有执行了，b的值仍然是2
		System.out.println(b);
		System.out.print('\r');
		
		
		//取反!
		//真变为假 假变为真
		boolean X = true;
		System.out.println(X); //输出true
		System.out.print(!X); //输出false
		System.out.print('\r');
		
		
		//异或^
		//不同，返回真 相同，返回假
		boolean Y = false;
		System.out.println(X^Y);//不同返回true
		System.out.println(X^!Y);//相同返回false
		System.out.print('\r');
		
		int Q = 1;
		boolean G = !(Q++ == 3)^(Q++ == 2)&&(Q++ == 3);//Q++意味着先取值进行判断==，然后如果为true则+1
		//先进行 Q++==3,i++先取值后运算，Q=1,1!=3,false,取反true,Q=2
		//对于Q++==2，2==2，true，Q=3
		//异或运算结果为false
		//&&左边为false，结果为false，右边不运算
		System.out.println(G);
		System.out.println(Q);       
	}
}
