package ��������;

public class ��������while {
	//ֻҪwhile�еı��ʽ�������ͻ᲻�ϵ�ѭ��ִ��
	public static void While(){
		int i = 0;
		while (i<5){//��ӡ0��4
			System.out.println(i);
			i++;
		}
	}
	
	public static void DoWhile(){
		//��ӡ0��4
		//��while�������ǣ������Ƿ��������ִ��һ�Σ��ٽ����ж�
		int i = 0;
		do {
			System.out.println(i);
		}while(i>5);
	}
	
	public static void main(String[] args) {
		While();
		DoWhile();//ֻ��ӡ��0
	}
}
