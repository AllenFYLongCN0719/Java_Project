package ������;

public class �߼������� {
	public static void main(String[] args) {
		//��·�� �� ��·�� 
		//��Ϊ��ʱ����Ϊ�� ����Ϊ�٣���Ϊ��
		
		//��·��& ���۵�һ�����ʽ��ֵ��true����false,�ڶ������ʽ���ᱻ����
		int i = 2;
		System.out.println(i == 1 & i++ == 2); //�������i++���ᱻִ�У�����i��ֵ��Ϊ3
		System.out.print(i);
		System.out.print('\r');
		
		//��·��&& ֻҪ��һ�����ʽ��ֵ��false���ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		//��֮�����true���ڶ������ʽ��ֵ�����м���
		int j =2;
		System.out.println(j == 2 && j++ == 2); //��Ϊj==1����false�������ұߵ�j++��û��ִ���ˣ�����j��ֵ����2
		System.out.println(j);
		System.out.print('\r');
		
		
		//��·�� �� ��·��
		//��Ϊ��ʱ����Ϊ�� ����Ϊ�棬��Ϊ��
		
		//��·��| ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		int a = 2;
		System.out.println(a == 1| a++ == 2);//�������i++���ᱻִ�У�����a��ֵ��3
		System.out.println(a);
		//System.out.print('\r');
		
		//��·��|| ֻҪ��һ�����ʽ��ֵ��true�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int b = 2;
		System.out.println(b== 2 || b++ ==2);//��Ϊb==2����true�������ұߵ�b++��û��ִ���ˣ�b��ֵ��Ȼ��2
		System.out.println(b);
		System.out.print('\r');
		
		
		//ȡ��!
		//���Ϊ�� �ٱ�Ϊ��
		boolean X = true;
		System.out.println(X); //���true
		System.out.print(!X); //���false
		System.out.print('\r');
		
		
		//���^
		//��ͬ�������� ��ͬ�����ؼ�
		boolean Y = false;
		System.out.println(X^Y);//��ͬ����true
		System.out.println(X^!Y);//��ͬ����false
		System.out.print('\r');
		
		int Q = 1;
		boolean G = !(Q++ == 3)^(Q++ == 2)&&(Q++ == 3);//Q++��ζ����ȡֵ�����ж�==��Ȼ�����Ϊtrue��+1
		//�Ƚ��� Q++==3,i++��ȡֵ�����㣬Q=1,1!=3,false,ȡ��true,Q=2
		//����Q++==2��2==2��true��Q=3
		//���������Ϊfalse
		//&&���Ϊfalse�����Ϊfalse���ұ߲�����
		System.out.println(G);
		System.out.println(Q);       
	}
}
