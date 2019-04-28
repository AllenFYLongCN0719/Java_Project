package 控制流程;

public class break练习 {
	public static void main(String[] args) {
		int fundPerMonth = 1000;
		int fundPerYear = fundPerMonth * 12;
		float rate = 0.20f;
		
//		F = p * ((1+r)^n);
		int sum = 0; //总收入
		int target = 100 * 10000; //目标收入
		for (int j = 0; j < 100; j++) {
			int year = j;
			float compoundInterestRate = 1; //复合利率
//				for (int i = 0; i < year; i++) {
//					compoundInterestRate = compoundInterestRate * (1+rate); //复合利率取次方
//				}
			compoundInterestRate = (float) Math.pow((1+rate), j); //次方算法
		
			int compoundInterest = (int) (fundPerYear * compoundInterestRate);
			sum += compoundInterest;//复合利率后的收入
			if (sum>=target){
				System.out.println("一共需要"+year+"年，超过目标"+target);
				break;
			}
		}
		
	}
}
