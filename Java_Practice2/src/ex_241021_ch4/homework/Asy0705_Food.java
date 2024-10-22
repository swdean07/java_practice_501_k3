package ex_241021_ch4.homework;

public class Asy0705_Food {

	String name;
	int price;
	String[] material;

	public Asy0705_Food(String name, int price, String[] material) {
		this.name = name;
		this.price = price;
		this.material = material;
	}

	public void introduce() {

		System.out.println("음식 이름은: " + name);

		System.out.print("음식의 재료들은: ");
		for (int i = 0; i < material.length; i++) {
			System.out.print(material[i]);
			if (i < material.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" 등 사용합니다.");

		System.out.println("가격은: " + price + "원");
	}

	public static void main(String[] args) {

		String[] materials = { "돼지고기", "밥", "국수" };

		Asy0705_Food food = new Asy0705_Food("돼지국밥", 9000, materials);

		food.introduce();
	}
}
