package 控制流程;

// a + b =8
// +   +
// c - d =6
// =   =
// 14  10
public class 小学算术题 {
	public static void Math() {
		int a,b,c,d = 0;
		int Limited = 100;
		
		for (a = 0; a <= 8; a++) { //a取值范围0~8 因为a取最大值时，保证a+b=8
			for (b = 0; b <= 8; b++) { //b取值范围0~8 因为b取最大值时，保证a+b=8
				for (c = 0; c <= 14; c++) { //c取值0~14 因为c取最大值时，保证a+c=14
					for (d = 0; d <= 10; d++) { //d取值0~10 因为d取最大值时，保证b+d=1
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
