package 控制流程;

public class 控制流程if {
	public static void training(){
		boolean b = false;
		//入股噢有多个表达式，必须用大括号包括起来
		if(b){
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		//否则表达式2 3 无论b是否为true都会被执行
		if(b)
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
			
		//如果只有一个表达式可以不用写括弧，看上去会简约一些
		if(b){
			System.out.println("yes1");
		}
		
		if(b)
			System.out.println("yes1");
	}
	
	public static void main(String[] args) {
		boolean b = false;
		//如果成立就打印yes
//		if(b){
//			System.out.println("yes");
//		}
		
		//if后面有一个分号，而分号也是一个完整的表达式
		//如果b为true，会执行这个分号，然后打印yes
		//如果b为false，不会执行这个分号，然后会打印yes
//		if(b)
//			System.out.println("yes");
		
		if(b)
			System.out.println("yes");
		else
			System.out.println("no");
	}
		
}
