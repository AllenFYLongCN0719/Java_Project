package ��������;

public class �ƽ�ָ�� {

	public static void FenGeDian() {
		int Numerator = 0; //����
		int Denominator = 0;//��ĸ
		float Final = 0;
		
		
		outloop://break��ǩ
		for (Numerator = 1;  Numerator<= 20; Numerator++) {
			for (Denominator = 1; Denominator <= 20; Denominator++) {
				if(0 == Numerator % 2 && 0 == Denominator % 2)//���ó�·��
					continue;
				else {
					Final = (float) Numerator / Denominator; //��������������ǿ��ת��Ϊfloat
					if (Final>0.61 & Final<0.62){
						System.out.println("��ƽ�ָ�㣨0.618�����������������ǣ�"
								+ Numerator + '/' + Denominator + '=' + Final);
						break outloop;
					}
//					else
//					{
//						System.out.println(0);
//					}
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FenGeDian();

	}

}
