package ������;
import java.util.Scanner;//����scanner�࣬ʹ����Դӿ���̨��������

public class ������Scanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();//��ȡ����
		System.out.println("��һ��������"+a);
		int b = s.nextInt();
		System.out.println("�ڶ���������"+b);
		
		float f = s.nextFloat();//��ȡ������
		System.out.println("��ȡ�ĸ������ǣ�"+f);
		
		String S = s.nextLine();
		System.out.println("��ȡ���ַ�����"+S);
		
		//��ȡ�����󣬽��Ŷ�ȡ�ַ���
		int i = s.nextInt();
		System.out.println("��ȡ��������"+i);
		//�����Ҫ��ȡ��������Ŷ�ȡ�ַ���������Ҫ����ִ������nextLine()
		//��Ϊ���ֱ�Ӷ�ȡ�ַ������ĳ����Ļ��ǻس����У�\r\n��,��ΪnextInt������ȡ������Ϣ
		String rn = s.nextLine();//ȡ�߻س�����
		String S1 = s.nextLine();//��ȡ�������ַ���
		System.out.println("��ȡ���ַ����ǣ�"+S1);
	}
}
