package 操作符;
import java.util.Scanner; //import + scanner 然后按alt+/ 快速创建类

public class 操作算数符BMI练习 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float High = s.nextFloat();
		System.out.println("请输入身高（m）："+High);
		float KG = s.nextFloat();
		System.out.println("请输入体重（kg）："+KG);
		
		float BMI = KG / (High*High);
		System.out.println("当前的BMI是:" + BMI);
	}
}
