import java.util.Scanner; //����scanner�࣬ʹ����Դӿ���̨��������

public class ���������� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("��һ�������ǣ�"+a);
		int b = s.nextInt();
		System.out.println("�ڶ��������ǣ�"+b);
		float c = a+b;
		System.out.println("������֮���ǣ�"+c);
		
		//������κ����㵥Ԫ�ĳ��ȳ���int,��ô�������Ͱ�����ĳ��ȼ��� 
		int d = 5;
		long e = 6;
		int f = (int)(a+b); //a+b����������long�ͣ�����Ҫ����ǿ��ת��
		long g = d+e;
		
		//����κ����㵥Ԫ�ĳ��ȶ�������int,��ô�������Ͱ���int������ 
		byte h = 1;
		byte j = 2;
		byte k = (byte)(a+b);//��������int���ͣ���Ҫ����ǿ��ת��
		
		//%ȡ�������ֽ�ȡģ
		int i = 5;
		int ii = 2;
		System.out.println(i%j);//���Ϊ1
		
		//++��-- ��ԭ���Ļ���������1���߼���1
		int X = 5;
		X++;
		System.out.println(X);//���Ϊ6
		
		int Z = 5;
		System.out.println(Z++);//���5
		System.out.println(Z);//���6
		
		int Z1 = 5;
		System.out.println(++Z1);//���6
		System.out.println(Z1);//���6
	}
}
