
public class �ݸ�ֽ {
	public static void main(String[] args) {
		int i =1;
		int j = ++i + i++ + ++i + ++i + i++;
		// ++i + i++ = 2 + 2
		// ++i + i++ + ++i = 2 + 2 + 4 ����ڶ�����i++��ȡֵ���1֮�����3��Ȼ��++i���4
		// ++i + i++ + ++i + ++i = 2 + 2 + 4 + 5
		// ++i + i++ + ++i + ++i + i++ = 2 + 2 + 4 + 5 + 5 ���i++��ȡֵ������5
		System.out.println(j); //2 + 2 + 4 + 5 + 5
	}
}
