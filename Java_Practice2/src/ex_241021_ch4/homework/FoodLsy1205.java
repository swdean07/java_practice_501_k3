package ex_241021_ch4.homework;

public class FoodLsy1205 {
	// 구성품, PM, Property : 속성, Method : 기능. 
//	1) 이름, String name 
//	2) 가격, int price 
//	3) 재료들, String [] material 
	String foodName;
	int foodPrice; 
	String [] material;
	
	//생성자를 만들기, 모든 속성을 다가지고 있는 걸로.
	public FoodLsy1205(String foodName, int foodPrice, String[] material) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.material = material;
	} 
	
	public void showInfo() {
//		해당 속성들을 다 소개하기. 
//		음식 이름은 : 돼지국밥
//		예시 : 음식의 재료들은 돼지고기, 밥, 국수 등 사용합니다. 
//		가격은 : 9000원,  
		System.out.println("음식 이름은 :" + this.foodName);
		System.out.println("가격은 : " + this.foodPrice +"원");
		System.out.println("음식의 재료들은 :");
		for (String source : material) {
			System.out.println(source);
		}
		
	}

	
	
}





