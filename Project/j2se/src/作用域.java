
public class 作用域 {
	int i = 1;
	public void method1(int i){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		new 作用域().method1(5);
	}
}
