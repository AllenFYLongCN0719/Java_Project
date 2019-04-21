
public class 变量Final {
	public void method1(){
		final int i = 5;//final变量只有一次被赋值的机会
		
		//i = 10; //i在第四行已经被赋值，所以这里会报错。
	}
	
	public void method2(){
		final int i;
		
		i = 10; //这里成功赋值
		
		//i = 11; //这里会报错
	}
	
	public void method3(final int j){
		//j = 5; //j无法在本方法中进行赋值，因为已经在参数中被final修饰。
		//原因是调用方法时会对方法重新传参数，相当于重新赋值。
		//如果再在方法内进行赋值，相当于二次赋值。
	}
}
