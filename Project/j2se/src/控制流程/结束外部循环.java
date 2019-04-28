package 控制流程;

public class 结束外部循环 {
	public static void BreakOut(){
		//打印单数     
    	for (int i = 0; i < 10; i++) {//外部这个循环无法被终止
    		
            for (int j = 0; j < 10; j++) { //break; 只能这个内部循环
            	System.out.println(i+":"+j);
            	if(0==j%2)  
            		break; //如果是双数，结束当前循环
    		}
    	}
	}

	public static void BOOLEAN(){
		boolean breakout = false; //是否终止外部循环的标记
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if(0 == j %2){
					breakout = true; //终止外部循环的标记设置为true
					break;
				}
			}
			if (breakout) //判断是否终止外部循环
				break;
		}
	}
	
	public void BreakLabel() {
		//在外部循环的前一行加上标签
		//在break的时候使用该标签
		//即能打到结束外部循环的效果
		
		outloop://outloop这个标示可以自定义，比如outloop1, ol2, out5
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					System.out.println(i+":"+j);
					if(0==j%2)
						break outloop; //如果是双数，结束外部循环
				}
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
