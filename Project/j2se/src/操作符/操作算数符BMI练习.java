package ������;
import java.util.Scanner; //import + scanner Ȼ��alt+/ ���ٴ�����

public class ����������BMI��ϰ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float High = s.nextFloat();
		System.out.println("��������ߣ�m����"+High);
		float KG = s.nextFloat();
		System.out.println("���������أ�kg����"+KG);
		
		float BMI = KG / (High*High);
		System.out.println("��ǰ��BMI��:" + BMI);
	}
}
