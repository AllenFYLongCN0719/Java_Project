
public class Hero {
	int Death; //����
	int Killed; //��ɱ
	int Assit; //����
	float gold; //��Ǯ
	int Objects_number; //������
	float attack_speed; //�����ٶ�
	String KilledString, DeathString;//ɱ�˺�˵�Ļ��ͱ�ɱ��˵�Ļ�
	
	String name; //����
	float hp, armor;
	int moveSpeed;
	
	//��û���ֵ ���з���ֵ�ķ���
	float getArmor(){
		return armor;
	}
	
	//�Ӷ��� �޷���ֵ�ķ���
	void keng(){
		System.out.println("�Ӷ��ѣ�");
	}
	
	//�����ƶ��ٶ�
	void addSpeed(int speed){ //int speed ������������
		//��ԭ���Ļ����������ƶ��ٶ�
		moveSpeed= moveSpeed + speed;
	}
	
	//����
	void legendary(){
		System.out.println("���Ѿ������ˣ�");
	}
	
	//��ǰѪ�� ����floatֵ
	float getHp(){
		return hp;
	}
	
	//��Ѫ
	void recovery(float blood){
		hp = hp + blood; //��Ѫ�������ֵ
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		garen.hp = 500;
		System.out.println(garen.name + " ��ǰѪ���� " + garen.hp);
		System.out.println("��Ѫ100��");
		garen.recovery(100);
		System.out.println("��ǰѪ���ǣ� "+ garen.hp);
	}
}
