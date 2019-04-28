package 操作符;

public class 赋值操作符 {
	public static void main(String[] args) {
		// +=为自加
		//i+=2与i=i+2相等
		int i =3;
		i+=2;
		System.out.println(i); //i=i+2=5
		
		int a = 1;
		a+=++a;
		System.out.println(a); //3
		
	}
}
