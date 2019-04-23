
public class 草稿纸 {
	public static void main(String[] args) {
		int i =1;
		int j = ++i + i++ + ++i + ++i + i++;
		// ++i + i++ = 2 + 2
		// ++i + i++ + ++i = 2 + 2 + 4 这里第二个数i++先取值后加1之后就是3，然后++i变成4
		// ++i + i++ + ++i + ++i = 2 + 2 + 4 + 5
		// ++i + i++ + ++i + ++i + i++ = 2 + 2 + 4 + 5 + 5 最后i++先取值所以是5
		System.out.println(j); //2 + 2 + 4 + 5 + 5
	}
}
