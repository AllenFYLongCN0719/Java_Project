package ��������;

public class �����ⲿѭ�� {
	public static void BreakOut(){
		//��ӡ����     
    	for (int i = 0; i < 10; i++) {//�ⲿ���ѭ���޷�����ֹ
    		
            for (int j = 0; j < 10; j++) { //break; ֻ������ڲ�ѭ��
            	System.out.println(i+":"+j);
            	if(0==j%2)  
            		break; //�����˫����������ǰѭ��
    		}
    	}
	}

	public static void BOOLEAN(){
		boolean breakout = false; //�Ƿ���ֹ�ⲿѭ���ı��
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if(0 == j %2){
					breakout = true; //��ֹ�ⲿѭ���ı������Ϊtrue
					break;
				}
			}
			if (breakout) //�ж��Ƿ���ֹ�ⲿѭ��
				break;
		}
	}
	
	public void BreakLabel() {
		//���ⲿѭ����ǰһ�м��ϱ�ǩ
		//��break��ʱ��ʹ�øñ�ǩ
		//���ܴ򵽽����ⲿѭ����Ч��
		
		outloop://outloop�����ʾ�����Զ��壬����outloop1, ol2, out5
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					System.out.println(i+":"+j);
					if(0==j%2)
						break outloop; //�����˫���������ⲿѭ��
				}
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
