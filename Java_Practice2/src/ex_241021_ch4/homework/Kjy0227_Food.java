package ex_241021_ch4.homework;

public class Kjy0227_Food {
	String name;
	int price;
	String[] materials;
	
	public Kjy0227_Food(String name, int price, String[] materials) {
		super();
		this.name = name;
		this.price = price;
		this.materials = materials;
	}
	
	public void introduce() {
		String str = "";
		for (String material : materials) {
			if(!"".equals(str)) {
				str += ", ";
			}
			str += material;
		}
		System.out.println("메뉴명 : " + name + " / 가격 : " + price + "원 / 재료 : " + str);
	}
}
