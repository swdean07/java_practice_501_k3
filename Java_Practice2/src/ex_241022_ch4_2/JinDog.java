package ex_241022_ch4_2;

public class JinDog extends Animal{
	
	// 재정의, 부모 클래스의 메서드의 이름은 똑같고, 
	// 내부 기능만 다르게 구현하는 방법
	// 클래스 설계시, 공통의 기능을 뽑아두고, 세부적으로 다른 부분들을 
	// 수정하기 위해서 이용함. 
	@Override
	public void speak() {
		System.out.println("멍멍");
	}
	
	// 기능 추가. 
	public void introduce() {
		System.out.println("이름 : " + super.name);
	}
	// 오버로딩, 같은 메서드 이름이지만, 정의된 매개변수의 타입, 갯수가 다른 경우. 
	public void introduce(String hobby) {
		
	
	}
	
	
	

}





