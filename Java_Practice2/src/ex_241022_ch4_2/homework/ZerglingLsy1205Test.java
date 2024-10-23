package ex_241022_ch4_2.homework;

public class ZerglingLsy1205Test extends ZergLsy1205Test {
	// A extends B, 
	// A: 자식 클래스 
	// B : 부모클래스
	private boolean speedUp;

	// get/set 있어야, 위의 멤버 speedUp에 
	// 값을 설정 하거나, 값을 가져오기 가능함. 
	public boolean isSpeedUp() {
		return speedUp;
	}

	public void setSpeedUp(boolean speedUp) {
		this.speedUp = speedUp;
	}
	
	//멤버의 속성을 출력하는 기능 
	public void showInfo() {
		System.out.println("종족 이름:" + super.getRepname() );
		System.out.println("유닛 이름:" + super.getUnitName() );
		System.out.println("유닛 종류:" + super.getUnitType() );
		System.out.println("유닛 가격:" + super.getUnitPrice() );
		
	}


	
	// 생성자 만들기, 기본 생성자 시스템에서 자동 생성 해줌. 
	// 하지만, 사용자가 직접 생성자를 만들면, 안 만들어줌. 
	// 기본 생성자를 이용한다면, 기본 생성자도 추가하고, 
	// 모든 멤버를 가지는 생성자를 만들어도 됩니다. 
	// 
	public ZerglingLsy1205Test(String unitName, int unitPrice,String unitType,  boolean speedUp) {
		super(unitName, unitType, unitPrice);
		this.speedUp = speedUp;
	}
	// 기본 생성자, 
	public ZerglingLsy1205Test() {
		super();
	}
	
}







