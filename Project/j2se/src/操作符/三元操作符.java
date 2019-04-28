package 操作符;
import java.util.Scanner;

public class 三元操作符 {
	public static void isWorkday(){
		try {
            System.out.println("今天是周几？");
            Scanner s = new Scanner(System.in);
            int d = s.nextInt();
            if (d < 1 || d > 7) {
                System.out.println("请输入1~7之间的整数！");
                System.out.println("------------");
                return;
            }
            String p = d >= 0 && d <= 6 ? "今天是工作日" : "今天是休息日"; //
            //三元操作符 int对应int，string 对应string
            //不能比较int，然后取string字符
            System.out.println(p);
            System.out.println("------------");
        } catch (Exception e) {
            System.out.println("请输入1~7之间的整数！");
            System.out.println("------------");
        }
    }
	public static void main(String[] args) {
		while (true){
			isWorkday();
		}
		//表达式?值1:值2
		//如果表达式为真，则返回值1
		//如果表达式为假，则返回值2
//		int i = 5;
//		int j = 6;
//		int k = i < j? 99 : 88;
//		//相当于
//		if (i < j){
//			k = 99;
//		} else {
//			k = 88;
//		}
//		System.out.println(k);
		
		
//		int Weekend = 6;
//		System.out.println("今天是周几？");
//		//System.out.println(Day);
//		Scanner s = new Scanner(System.in);
//		int Day = s.nextInt();
//		String week1 = "工作日";
//		String week2 = "周末";
//		int k1 = Day >= Weekend? 6 : 5;
//		if(Day > 7 || Day < 1){
//			System.out.println("你输入了错误的日期");}
//		else if(k1 == 6){
//			System.out.println("今天是"+week2);
//		} else if(k1==5){
//			System.out.println("今天是"+week1);
//		}
//	}
	
	
	}
}