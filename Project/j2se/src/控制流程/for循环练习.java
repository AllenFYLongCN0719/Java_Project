package ��������;


public class forѭ����ϰ {
	public static void SB(){
		int sum = 0; //������
		int MoneyEachDay = 0; //ÿ������
		int day = 10; //������
		for (int i = 1; i <= day; i++ ){
			if (0==MoneyEachDay)//�ж��ǲ��ǵ�һ��
				MoneyEachDay=1;
			else //���ǵ�һ���ִ�� �ӵڶ��쿪ʼ��ʱ��MoneyEachDay��ŵ����ݾ���1�� Ȼ��Ϳ�ʼִ��MoneyEachDay*=2
				MoneyEachDay*=2;
			
			sum+=MoneyEachDay;//������
		}
		
		System.out.println("10���ܹ�����"+sum);
		
	}
	
	public static void main(String[] args) {
		SB();
	}
}
