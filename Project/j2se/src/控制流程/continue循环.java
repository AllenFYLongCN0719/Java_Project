package 控制流程;

public class continue循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 0; j < 10; j++){
			
			//打印单数
			if(0==j%2)
				continue; //如果是双数，后面的代码就不执行，直接进入下一个循环
			System.out.println(j);
				
		}
	}

}
