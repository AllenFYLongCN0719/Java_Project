
public class Item {
	String name; //名字
	int price; //价钱
	
	public static void main(String[] args) { //alt+/ 快速创建主方法
		Item Blood = new Item();
		Blood.name = "血瓶";
		Blood.price = 50;
		
		Item Shoe = new Item();
		Shoe.name = "草鞋";
		Shoe.price = 300;
		
		Item Sword = new Item();
		Sword.name = "长剑";
		Sword.price = 350;
	}
}
