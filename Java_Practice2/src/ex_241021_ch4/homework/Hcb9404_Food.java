package ex_241021_ch4.homework;

public class Hcb9404_Food {
		//property
		String name;
		int price;
		String [] materials;
		
		//method
		public void introduce() {
			System.out.println("오늘의 추천 메뉴는 " + name +"입니다.");
			System.out.println("가격은 " + price + "원 입니다.");
			System.out.println("재료는");
			for (String string : materials) {
				System.out.println(string);
			}
			System.out.println("입니다.");
		}
		
		public Hcb9404_Food() {};
		
		public Hcb9404_Food(String name,int price,String[] materials) {
			this.name = name;
			this.price = price;
			this.materials = materials;
		}

	}