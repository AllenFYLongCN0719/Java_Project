package ��������;

// a + b =8
// +   +
// c - d =6
// =   =
// 14  10
public class Сѧ������ {
	public static void Math() {
		int a,b,c,d = 0;
		int Limited = 100;
		
		for (a = 0; a <= 8; a++) { //aȡֵ��Χ0~8 ��Ϊaȡ���ֵʱ����֤a+b=8
			for (b = 0; b <= 8; b++) { //bȡֵ��Χ0~8 ��Ϊbȡ���ֵʱ����֤a+b=8
				for (c = 0; c <= 14; c++) { //cȡֵ0~14 ��Ϊcȡ���ֵʱ����֤a+c=14
					for (d = 0; d <= 10; d++) { //dȡֵ0~10 ��Ϊdȡ���ֵʱ����֤b+d=1
						if (8 == a + b && 10 == b + d && 6 == c - d && 14 == a + c ){
							System.out.println("a=" + a + ',' + "b=" + b + ',' 
									+ "c=" + c + ',' + "d="+ d);
						}
					}
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math();
	}

}
