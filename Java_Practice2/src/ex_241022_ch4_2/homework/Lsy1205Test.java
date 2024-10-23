package ex_241022_ch4_2.homework;

public class Lsy1205Test {
	public static void main(String[] args) {
		// 사용해보기. 
		// A a = new A();
		ZerglingLsy1205Test zergling1 = new ZerglingLsy1205Test(); 
//		zergling1.move();
//		zergling1.attack();
//		zergling1.upgrade();
		// 초깃값 설정해야하는데, 현재 기본 생성자 밖에없어서, 
		zergling1.setUnitName("저글링");
		zergling1.setUnitType("지상유닛");
		zergling1.setUnitPrice(50);
		zergling1.showInfo();
		// 생성자를 이용해서 해당 인스턴스 멤버들의 값을 초기화 해보기. 
		
		// 2번째 인스턴스 만들기. 
		ZerglingLsy1205Test zergling2 =
				new ZerglingLsy1205Test("저글링2",50,"지상유닛2",false);
		zergling2.showInfo();
		
	}
}








