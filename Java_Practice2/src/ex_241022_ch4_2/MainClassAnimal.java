package ex_241022_ch4_2;

public class MainClassAnimal {
	public static void main(String[] args) {
		JinDog jinDog = new JinDog();
		jinDog.name = "진돗개";
		jinDog.age = 1;
		// 현재 , 부모 클래스의 기본 기능을 그대로 이용 할 경우. 
		// 오버라이드 하고 , 사용시, 자식 클래스의 메서드를 이용함.
		// JinDog , 속성으로 private hobby  추가하면, 직접 접근이 안됨. 
		// 왜냐하면, 은닉, 숨김. 그래서, 접근시, get/setter 라는 것을 이용해야함. 
		// jinDog.hobby 접근이 안됨. 은닉이 되어서, 
		// 값 설정시 set 접근하고, 값 가져오기 get 이용함. 
		jinDog.setHobby("공놀이");
		jinDog.speak();
		jinDog.introduce();
		jinDog.introduce("개껌", "서면");
		
		JinDog jinDog2 = new JinDog("진돌이",2,"수영");
		jinDog2.showInfo();
		
	}
}








