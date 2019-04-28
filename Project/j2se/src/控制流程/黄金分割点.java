package 控制流程;

public class 黄金分割点 {

	public static void FenGeDian() {
		int Numerator = 0; //分子
		int Denominator = 0;//分母
		float Final = 0;
		
		
		outloop://break标签
		for (Numerator = 1;  Numerator<= 20; Numerator++) {
			for (Denominator = 1; Denominator <= 20; Denominator++) {
				if(0 == Numerator % 2 && 0 == Denominator % 2)//该用长路与
					continue;
				else {
					Final = (float) Numerator / Denominator; //这里运算结果必须强制转换为float
					if (Final>0.61 & Final<0.62){
						System.out.println("离黄金分割点（0.618）最近的两个数相除是："
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
