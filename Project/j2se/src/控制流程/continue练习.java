package ��������;

public class continue��ϰ {
	public static void main(String[] args) {
		//��ӡ����3��5�ı���
		for (int i = 1; i <= 100 ; i++){
			if (0 == i % 3 || 0 == i % 5) //ȡģ������Ϊ0 ��Ϊ3����5�ı���
				continue;
			System.out.println(i);
		}
	}
}
