package 控制流程;


public class for循环练习 {
	public static void SB(){
		int sum = 0; //总收入
		int MoneyEachDay = 0; //每日收入
		int day = 10; //总天数
		for (int i = 1; i <= day; i++ ){
			if (0==MoneyEachDay)//判断是不是第一天
				MoneyEachDay=1;
			else //不是第一天就执行 从第二天开始的时候MoneyEachDay存放的数据就是1了 然后就开始执行MoneyEachDay*=2
				MoneyEachDay*=2;
			
			sum+=MoneyEachDay;//总收入
		}
		
		System.out.println("10天总共收入"+sum);
		
	}
	
	public static void main(String[] args) {
		SB();
	}
}
