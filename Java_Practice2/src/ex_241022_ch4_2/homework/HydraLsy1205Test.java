package ex_241022_ch4_2.homework;


public class HydraLsy1205Test extends ZergLsy1205Test {
	
	private boolean LerkerCheck;

	public boolean isLerkerCheck() {
		return LerkerCheck;
	}

	public void setLerkerCheck(boolean lerkerCheck) {
		LerkerCheck = lerkerCheck;
	}

	public HydraLsy1205Test(String unitName, String unitType, int unitPrice, boolean lerkerCheck) {
		super(unitName, unitType, unitPrice);
		LerkerCheck = lerkerCheck;
	}
	

	//멤버의 속성을 출력하는 기능 
	public void showInfo() {
		System.out.println("종족 이름:" + super.getRepname() );
		System.out.println("유닛 이름:" + super.getUnitName() );
		System.out.println("유닛 종류:" + super.getUnitType() );
		System.out.println("유닛 가격:" + super.getUnitPrice() );
		
	}
	
	@Override
	public void move() {
		System.out.println("느리게 꿈틀움직임");
	}
	@Override
	public void attack() {
		System.out.println("침 공격");
	}
	@Override
	public void upgrade() {
		System.out.println("노업");
	}
	
	
	
}
