package ex_241021_ch4.homework;


	public class FoodKjy1122 {
	    String name;
	    int price;
	    String[] materials;

	    public FoodKjy1122(String name, int price, String[] materials) {
	        this.name = name;
	        this.price = price;
	        this.materials = materials;
	    }

	    void introduce() {
	        System.out.println("음식 이름은: " + name);
	        System.out.print("음식의 재료들은: ");
	        for (String material : materials) {
	            System.out.print(material + " ");
	        }
	        System.out.println("등 사용합니다.");
	        System.out.println("가격은: " + price + "원");
	    }
	}


