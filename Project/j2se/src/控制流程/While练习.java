package ��������;

import java.util.Scanner;

public class While��ϰ {

	public static void While(int n){ //����n��int��������
		int sum = n; //�׳��ܺͷ�����sum��
		while(n>1){
			n--; //�׳���N*(N-1)*(N-2)*...*1,��������ȡֵn��Ȼ��ѭ��-1
			sum*=n; //sum = sum*n�����˻��������sum
		}
		System.out.println("�׳��ǣ�"+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("������һ��������");
		int a = s.nextInt();
		While(a); //�����û���������ݴ��ݸ�While
	}

}
