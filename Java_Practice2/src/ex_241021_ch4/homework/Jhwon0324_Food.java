package ex_241021_ch4.homework;

public class Jhwon0324_Food {
	private String name;
	private int price;
	private String[] ingredients;
	
	public Jhwon0324_Food(String name, int price, String[] ingredients) {
		this.name = name;
		this.price = price;
		this.ingredients = ingredients;
	}
	
	public void describe() {
		System.out.println(name + " : " + String.join(", ", ingredients) + "을(를) 넣어서 만드는 놀라운 음식. 가격은 "+ price +"원.");
	}
	
	public void applyInflation() {
		double priceReal = price;
		priceReal *= 1.25;
		
		int priceInt = (int) (Math.ceil(priceReal / 100.0) * 100.0);
		this.price = priceInt;
		
		System.out.printf("물가가 상승하여 %s 가격이 %d원이 되었습니다! 안돼에에!!\n", this.name, this.price);
	}
	
}
