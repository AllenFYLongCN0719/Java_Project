package 控制流程;

public class switch语句 {
	public static void main(String[] args) {
		//switch可以使用在byte, short, int, char, String, enum
		//每个表达式结束，都应该有break;
		//enum是枚举类型
		
		int day = 5;
		switch(day){
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("这是什么鬼");
		}
		
	}
}
