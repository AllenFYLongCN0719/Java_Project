
public class ����Final {
	public void method1(){
		final int i = 5;//final����ֻ��һ�α���ֵ�Ļ���
		
		//i = 10; //i�ڵ������Ѿ�����ֵ����������ᱨ��
	}
	
	public void method2(){
		final int i;
		
		i = 10; //����ɹ���ֵ
		
		//i = 11; //����ᱨ��
	}
	
	public void method3(final int j){
		//j = 5; //j�޷��ڱ������н��и�ֵ����Ϊ�Ѿ��ڲ����б�final���Ρ�
		//ԭ���ǵ��÷���ʱ��Է������´��������൱�����¸�ֵ��
		//������ڷ����ڽ��и�ֵ���൱�ڶ��θ�ֵ��
	}
}
