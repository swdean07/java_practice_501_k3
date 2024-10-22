package ex_241021_ch4.homework;

public class soojong_menuClass {
	String name;
	int price;
	String [] material;
	
	void introduce() {
		System.out.println("메뉴 : " + name + ", 가격 : " + price + "원");
		for (String string : material) {
			System.out.println("재료 : " + string);
		}
	}

	public soojong_menuClass() {};
	public soojong_menuClass(String name, int price, String[] material) {
		super();
		this.name = name;
		this.price = price;
		this.material = material;
	}
	
	
}
