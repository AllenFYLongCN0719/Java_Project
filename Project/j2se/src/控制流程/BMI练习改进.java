package ��������;

import java.util.Scanner;

public class BMI��ϰ�Ľ� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float High = s.nextFloat();
		System.out.println("��������ߣ�m����"+High);
		float KG = s.nextFloat();
		System.out.println("���������أ�kg����"+KG);
		
		float BMI = KG / (High*High);
		System.out.println("��ǰ��BMI��:" + BMI);
		
		if (BMI<18.5)
			System.out.println("���ع���");
		else if (18.5<= BMI & BMI <24) //����Ҫʹ�ó�·�� ԭ����Ҫ�����������������ж����
			System.out.println("������Χ");
		else if (24<= BMI & BMI <27)
			System.out.println("���ع���");
		else if (27<= BMI & BMI <30)
			System.out.println("��ȷ���");
		else if (30<= BMI & BMI <35)
			System.out.println("�жȷ���");
		else if (35<= BMI)
			System.out.println("�ضȷ���");
	}
}
