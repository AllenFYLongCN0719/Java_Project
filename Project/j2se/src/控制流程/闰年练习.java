package ��������;

import java.util.Scanner;

public class ������ϰ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���������");
		int a = s.nextInt();
		
//		if (a%4 == 0 && a % 100 != 0){ //��ȡģ������%��ȡ�ࣩ, �жϵ���==�� �жϲ�����!=
//			System.out.println(a+"������");
//		} else if(a % 400 == 0){
//			System.out.println(a+"������");
//		} else {
//			System.out.println(a+"��������");
//		}
		if (a<0){
			System.out.println("�����빫Ԫ���");
		}
		
		if ((a % 4 == 0 && a % 100 != 0)||(a == 400)){
			System.out.println(a + "������");
		} else{
			System.out.print(a + "��������");
		}
	}
}
