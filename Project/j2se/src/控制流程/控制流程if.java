package ��������;

public class ��������if {
	public static void training(){
		boolean b = false;
		//������ж�����ʽ�������ô����Ű�������
		if(b){
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		//������ʽ2 3 ����b�Ƿ�Ϊtrue���ᱻִ��
		if(b)
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
			
		//���ֻ��һ�����ʽ���Բ���д����������ȥ���ԼһЩ
		if(b){
			System.out.println("yes1");
		}
		
		if(b)
			System.out.println("yes1");
	}
	
	public static void main(String[] args) {
		boolean b = false;
		//��������ʹ�ӡyes
//		if(b){
//			System.out.println("yes");
//		}
		
		//if������һ���ֺţ����ֺ�Ҳ��һ�������ı��ʽ
		//���bΪtrue����ִ������ֺţ�Ȼ���ӡyes
		//���bΪfalse������ִ������ֺţ�Ȼ����ӡyes
//		if(b)
//			System.out.println("yes");
		
		if(b)
			System.out.println("yes");
		else
			System.out.println("no");
	}
		
}
