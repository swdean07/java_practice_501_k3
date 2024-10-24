package ex_241021_ch4.homework;
public class FoodKjh0313 {
	String foodName;
	int foodPrice; 
	String [] material;
	

	public FoodKjh0313(String foodName, int foodPrice, String[] material) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.material = material;
	} 
	
	public void showInfo() {
		System.out.println("음식 이름 :" + this.foodName);
		System.out.println("가격은 : " + this.foodPrice +"원");
		System.out.println("음식 재료 :");
		for (String source : material) {
			System.out.println(source);
		}
		
	}
	
	
}