package ��������;

public class break��ϰ {
	public static void main(String[] args) {
		int fundPerMonth = 1000;
		int fundPerYear = fundPerMonth * 12;
		float rate = 0.20f;
		
//		F = p * ((1+r)^n);
		int sum = 0; //������
		int target = 100 * 10000; //Ŀ������
		for (int j = 0; j < 100; j++) {
			int year = j;
			float compoundInterestRate = 1; //��������
//				for (int i = 0; i < year; i++) {
//					compoundInterestRate = compoundInterestRate * (1+rate); //��������ȡ�η�
//				}
			compoundInterestRate = (float) Math.pow((1+rate), j); //�η��㷨
		
			int compoundInterest = (int) (fundPerYear * compoundInterestRate);
			sum += compoundInterest;//�������ʺ������
			if (sum>=target){
				System.out.println("һ����Ҫ"+year+"�꣬����Ŀ��"+target);
				break;
			}
		}
		
	}
}
