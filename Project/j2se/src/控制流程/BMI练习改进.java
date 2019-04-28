package 控制流程;

import java.util.Scanner;

public class BMI练习改进 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float High = s.nextFloat();
		System.out.println("请输入身高（m）："+High);
		float KG = s.nextFloat();
		System.out.println("请输入体重（kg）："+KG);
		
		float BMI = KG / (High*High);
		System.out.println("当前的BMI是:" + BMI);
		
		if (BMI<18.5)
			System.out.println("体重过轻");
		else if (18.5<= BMI & BMI <24) //这里要使用长路与 原因是要满足两个条件才能判定真假
			System.out.println("正常范围");
		else if (24<= BMI & BMI <27)
			System.out.println("体重过重");
		else if (27<= BMI & BMI <30)
			System.out.println("轻度肥胖");
		else if (30<= BMI & BMI <35)
			System.out.println("中度肥胖");
		else if (35<= BMI)
			System.out.println("重度肥胖");
	}
}
