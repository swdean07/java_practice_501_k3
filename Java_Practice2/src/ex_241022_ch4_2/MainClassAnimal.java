package ex_241022_ch4_2;

public class MainClassAnimal {
	public static void main(String[] args) {
		JinDog jinDog = new JinDog();
		jinDog.name = "진돗개";
		jinDog.age = 1;
		// 현재 , 부모 클래스의 기본 기능을 그대로 이용 할 경우. 
		// 오버라이드 하고 , 사용시, 자식 클래스의 메서드를 이용함. 
		jinDog.speak();
	}
}
