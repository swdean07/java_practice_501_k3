package ex_241021_ch4.homework;

public class Cgw0910Food {
	String foodName;
	int foodPrice;
	String [] meterials;
	
	void introduce() {
		System.out.println("음식 이름: " + foodName);
		System.out.println("음식 가격: " + foodPrice);
		System.out.print("음식 재료는 ");
		for (int i = 0; i < meterials.length; i ++) {
			String meterial = meterials[i];
			if (i == meterials.length - 1)
				System.out.print(meterial);
			else {
				System.out.println(meterial + ", ");
			}
		}
		System.out.print("가 사용되었습니다.");
	}
	public Cgw0910Food(String foodName, int foodPrice, String[] meterials) {
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.meterials = meterials;
	}
}
