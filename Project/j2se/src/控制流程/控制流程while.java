package 控制流程;

public class 控制流程while {
	//只要while中的表达式成立，就会不断地循环执行
	public static void While(){
		int i = 0;
		while (i<5){//打印0到4
			System.out.println(i);
			i++;
		}
	}
	
	public static void DoWhile(){
		//打印0到4
		//与while的区别是，无论是否成立，先执行一次，再进行判断
		int i = 0;
		do {
			System.out.println(i);
		}while(i>5);
	}
	
	public static void main(String[] args) {
		While();
		DoWhile();//只打印出0
	}
}
