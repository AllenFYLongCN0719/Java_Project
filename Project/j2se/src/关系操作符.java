import java.util.Scanner;
public class ��ϵ������ {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 5;
		
		//> ����
		//>= ���ڻ����
		//< С��
		//<= С�ڻ����
		//== �Ƿ����
		//!= �Ƿ񲻵�
		System.out.println(a>b); //����false
		System.out.println(a>=c); //����true
		
		System.out.println(a==b); //����false
		System.out.println(a!=b); //����true
		
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		System.out.println("��һ�������ǣ�"+d);
		
		int e = s.nextInt();
		System.out.println("�ڶ��������ǣ�"+e);
		
		System.out.println("�Ƚ�"+d+'>'+e+':'+(d>e)); //����(d>e) ����������ʹ����Ϊһ������
		System.out.println("�Ƚ�"+d+">="+e+':'+(d>=e));
		System.out.println("�Ƚ�"+d+'<'+e+':'+(d<e));
		System.out.println("�Ƚ�"+d+"<="+e+':'+(d<=e));
		System.out.println("�Ƚ�"+d+"=="+e+':'+(d==e));
		System.out.println("�Ƚ�"+d+"!="+e+':'+(d!=e));
	}
}
