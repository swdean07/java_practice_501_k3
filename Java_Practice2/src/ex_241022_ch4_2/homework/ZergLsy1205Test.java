package ex_241022_ch4_2.homework;

public class ZergLsy1205Test {
	// 클래스 구성품 1) 멤버(속성) 2) 메서드
	// 변수 종류 1) 인스턴스 멤버 변수 2) 스태틱 변수(공유자원) 
	// 
	private String unitName;
	private String unitType;
	private int unitPrice;
	static final String REPNAME = "저그";
	
	
	// 접근지정자 , 1)public, 2) private 3) protected 4)default
	// 2) private , 직접 접근이 안됨. 
	// 인스턴스를 만들어서, A a = new A(); -> a.name , 직접 접근. x
	// 다른 방법 -> get/set 메서드를 이용함. 
	// 우클릭 -> source -> generate get/set 선택. 해당 멤버 , 일단 전체 선택. 
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public static String getRepname() {
		return REPNAME;
	}
	
	// 기본 기능, 추상 클래스, 인터페이스를 아직 사용 안하고 있어서,  
	// 구체적으로 메서드를 정의함. 메서드, 선언부와 구현부 모두 정의. 
	// 기능: 1) 이동 2) 공격 , 3)업그레이드
	// static 키워드 없으면, 인스턴스 메서드라고 함. 
	public void move() {
		System.out.println("어떻게 움직이지? 걷기? 날아가기? 등.");
	}
	
	public void attack() {
		System.out.println("어떻게 공격하니? 직접 타격? 간접 타격?");
	}
	
	public void upgrade() {
		System.out.println("무엇을 업그레이드 할거니? 공격?방어?");
		
	}
	// 부모 클래스에서, 생성자 추가, 1) 기본 2) 매개변수 3개인 생성자 추가
	public ZergLsy1205Test(String unitName, String unitType, int unitPrice) {
		super();
		this.unitName = unitName;
		this.unitType = unitType;
		this.unitPrice = unitPrice;
	}
	
	public ZergLsy1205Test() {
		// 기본으로 들어가 있는 것과 같은 효과. 
		// super();
		
	}
	
	
	
	
}




