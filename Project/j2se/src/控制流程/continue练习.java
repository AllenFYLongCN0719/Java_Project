package 控制流程;

public class continue练习 {
	public static void main(String[] args) {
		//打印除开3或5的倍数
		for (int i = 1; i <= 100 ; i++){
			if (0 == i % 3 || 0 == i % 5) //取模，余数为0 则为3或者5的倍数
				continue;
			System.out.println(i);
		}
	}
}
