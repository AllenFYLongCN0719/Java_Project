package ��������;

import java.util.Scanner;

public class forѭ�� {
	public static void For(int F){
		int b = 5;
		if (F >= b || F < 0){
			System.out.println("�����ɶ�����");
		} else {
			for (int a = F; a < b; a++){
			System.out.println("for ѭ�������"+a);
		    }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		For(a);
	}

}
