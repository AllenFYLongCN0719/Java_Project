package ������;
import java.util.Scanner;

public class ��Ԫ������ {
	public static void isWorkday(){
		try {
            System.out.println("�������ܼ���");
            Scanner s = new Scanner(System.in);
            int d = s.nextInt();
            if (d < 1 || d > 7) {
                System.out.println("������1~7֮���������");
                System.out.println("------------");
                return;
            }
            String p = d >= 0 && d <= 6 ? "�����ǹ�����" : "��������Ϣ��"; //
            //��Ԫ������ int��Ӧint��string ��Ӧstring
            //���ܱȽ�int��Ȼ��ȡstring�ַ�
            System.out.println(p);
            System.out.println("------------");
        } catch (Exception e) {
            System.out.println("������1~7֮���������");
            System.out.println("------------");
        }
    }
	public static void main(String[] args) {
		while (true){
			isWorkday();
		}
		//���ʽ?ֵ1:ֵ2
		//������ʽΪ�棬�򷵻�ֵ1
		//������ʽΪ�٣��򷵻�ֵ2
//		int i = 5;
//		int j = 6;
//		int k = i < j? 99 : 88;
//		//�൱��
//		if (i < j){
//			k = 99;
//		} else {
//			k = 88;
//		}
//		System.out.println(k);
		
		
//		int Weekend = 6;
//		System.out.println("�������ܼ���");
//		//System.out.println(Day);
//		Scanner s = new Scanner(System.in);
//		int Day = s.nextInt();
//		String week1 = "������";
//		String week2 = "��ĩ";
//		int k1 = Day >= Weekend? 6 : 5;
//		if(Day > 7 || Day < 1){
//			System.out.println("�������˴��������");}
//		else if(k1 == 6){
//			System.out.println("������"+week2);
//		} else if(k1==5){
//			System.out.println("������"+week1);
//		}
//	}
	
	
	}
}