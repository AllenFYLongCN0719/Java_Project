
public class Transfer {
	public static void main(String[] args) {
		char c1 = 'A';
		short s = 80;
		
		//��Ȼshort��char����16λ��
		//���Ǳ˴�֮�䣬��Ȼ��Ҫǿ��ת��
		c1 = (char) s;
		
		byte b1 = 5;
		int i1= 10;
		int i2 = 300;
		
		b1 = (byte) i1;
		//��Ϊi1��ֵ����byte��Χ֮�ڵģ����Լ����ǽ���ǿ��ת��
		//���õ�ֵ��Ҳ��10
		System.out.println(b1);
		
		//��Ϊi2��ֵ����byte��Χ֮��ģ����Ծͻᰴ��byte�ĳ��Ƚ��н�ȡ
		//i2��ֵ��300�����Ӧ�Ķ���������100101100
		//����byte�ĳ��ȣ�8λ���н�ȡ����ֵΪ00101100��Ϊ44
		b1 = (byte) i2;
		System.out.println(b1);
		
		//�鿴һ��������Ӧ�Ķ����Ƶķ�����
		System.out.println(Integer.toBinaryString(i2));
		
		short a = 1;
		short b = 2;
		//short c = a+b //�ᱨ�� a+b�޷�����short c��
		short c = (short)(a+b); //��a+b��������ǿ��ת��
		System.out.println(c);
		System.out.println(a+b);//������̻�������Զ�ת�� Ĭ��int
	}
}
