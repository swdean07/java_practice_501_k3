package ex_241022_ch4_2.homework;

import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Lsy1205Test {
	
	public static void randomPick(ZergLsy1205Test [] zergs) {
		Random random = new Random();
		int randomNumber = random.nextInt(zergs.length); // 3 미만의 정수를 뽑기, 
		System.out.println("랜덤숫자 확인 : " + randomNumber);
		// zergs[randomNumber] : 부모 타입
		// instanceof 연산자를 이용해서, 해당 자식타입이 맞는지 확인 후. 
		// 맞다면, 다시 원래의 자식 클래스 타입으로 형변환을 함. 
		// 큰 타입 -> 작은 타입으로 변경, 다운 캐스팅 
		// (작은 클래스 타입)참조형 변수
		if(zergs[randomNumber] instanceof ZerglingLsy1205Test) {
			System.out.println("zergs[randomNumber]의 instanceof 의 결과 : ZerglingLsy1205Test 타입");
			ZerglingLsy1205Test z1 = (ZerglingLsy1205Test)zergs[randomNumber];
			z1.showInfo();
		} else if (zergs[randomNumber] instanceof HydraLsy1205Test) {
			System.out.println("zergs[randomNumber]의 instanceof 의 결과 : HydraLsy1205Test 타입");
			HydraLsy1205Test h1 = (HydraLsy1205Test)zergs[randomNumber];
			h1.showInfo();
		} else if (zergs[randomNumber] instanceof MutalLsy1205Test) {
			System.out.println("zergs[randomNumber]의 instanceof 의 결과 : MutalLsy1205Test 타입");
			MutalLsy1205Test m1 = (MutalLsy1205Test)zergs[randomNumber];
			m1.showInfo();
		}
	}
	
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
//		zergling1.showInfo();
		// 생성자를 이용해서 해당 인스턴스 멤버들의 값을 초기화 해보기. 
		
		// 2번째 인스턴스 만들기. 
		ZerglingLsy1205Test zergling2 =
				new ZerglingLsy1205Test("저글링2",50,"지상유닛2",false);
//		zergling2.showInfo();
		
		// 히드라 뽑기 
		HydraLsy1205Test hydra1 =
				new HydraLsy1205Test("히드라1", "지상유닛", 100, false);
//		hydra1.showInfo();
		
		//뮤탈 뽑기 
		MutalLsy1205Test mutal1 = 
				new MutalLsy1205Test("뮤탈1", "공중유닛", 200, "red");
//		mutal1.showInfo();
		
		// 저그 부모 클래스 타입으로, 자식 클래스들을 배열에 담아서, 정의.
		// 다형성, 큰 타입은 작은 타입을 담을수 있다. 포함 할수 있다. 
		// 형변환, 작은 타입 -> 큰 타입 , 업캐스팅 
		// 주의사항, 
		// 부모 타입으로 배열을 만들면, 그 자식들의 타입도 전부 부모타입으로 됨. 
		// 그래서, 실제 사용을 할려면, 원래의 본인 클래스 타입으로 형변환을 해야함. 
		// 부모 타입 -> 자식 타입으로 변경 후 사용해야함. 
		ZergLsy1205Test [] zergs = {zergling1,zergling2,
				hydra1,mutal1};
		// 랜덤으로 배열에서 선택 후, 각 자식 클래스로 형변환을 하고, 출력해야함. 
		// 
		randomPick(zergs);
		
	}
}








