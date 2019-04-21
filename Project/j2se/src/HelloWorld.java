public class HelloWorld{
	public static void main(String[]args){
		System.out.println("hello world");
		
		double d = 123.45;
		
		//该行会出错，因为54.321是double类型
		//float f = 54.321;
		float f2 = 54.321f;
		
		double D2 = 2.769343;
		int Int_Year = 365;
		int Month = 12;
		char Eat = '吃';
		boolean No = false; //布尔变量 boolean
		
		float f1 = 123.4F; // float类型
		double d1 = 123.4; // 默认就是double类型
		double d3 = 1.234e2; // 科学计数法表示double
		
		//转义字符
		char tab = '\t';//制表符
		char carriageReturn = '\r';//回车
		char newLine = '\n';
		char doubleQuote = '\"';//双引号
		char singleQuote = '\''; //单引号
		char backslash = '\\'; //反斜杠
		
		byte b = 27;
		short s = 376;
		int i = 1200342;
		long l = 2324235;
		float f = 1.34F;
		double dd = 23.456;
		char c = '菜';
		String str ="你死了";
	}
}