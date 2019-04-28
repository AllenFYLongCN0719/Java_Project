package 控制流程;

public class break语句 {
	public static void main(String[] args) {
		//打印单数
		for(int j = 1; j < 10; j++){
			if (0==j%2)
				break; //如果是双数，直接结束循环
			
			System.out.println(j);
		}
	}
}
