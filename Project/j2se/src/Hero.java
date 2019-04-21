
public class Hero {
	int Death; //死亡
	int Killed; //击杀
	int Assit; //助攻
	float gold; //金钱
	int Objects_number; //补刀数
	float attack_speed; //攻击速度
	String KilledString, DeathString;//杀人后说的话和被杀后说的话
	
	String name; //姓名
	float hp, armor;
	int moveSpeed;
	
	//获得护甲值 具有返回值的方法
	float getArmor(){
		return armor;
	}
	
	//坑队友 无返回值的方法
	void keng(){
		System.out.println("坑队友！");
	}
	
	//增加移动速度
	void addSpeed(int speed){ //int speed 叫作方法参数
		//在原来的基础上增加移动速度
		moveSpeed= moveSpeed + speed;
	}
	
	//超神
	void legendary(){
		System.out.println("你已经超神了！");
	}
	
	//当前血量 返回float值
	float getHp(){
		return hp;
	}
	
	//回血
	void recovery(float blood){
		hp = hp + blood; //回血后的生命值
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		garen.hp = 500;
		System.out.println(garen.name + " 当前血量是 " + garen.hp);
		System.out.println("回血100点");
		garen.recovery(100);
		System.out.println("当前血量是： "+ garen.hp);
	}
}
