package ex_241022_ch4_2.homework;

public class MutalLsy1205Test extends ZergLsy1205Test {
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//생성자 매개변수 4개
	public MutalLsy1205Test(String unitName, String unitType, int unitPrice, String color) {
		super(unitName, unitType, unitPrice);
		this.color = color;
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
		System.out.println("날아가기");
	}
	@Override
	public void attack() {
		System.out.println("3단 공격");
	}
	@Override
	public void upgrade() {
		System.out.println("노업");
	}
	
}
