package ex_241022_ch4_2;

public class JinDog extends Animal {
	// 은닉된 속성에 접근시, get/set 메서드를 만들기.
	// 우클릭 -> Source -> Generate Getters and Setters 선택.
	// get~, set~ 메서드를 추가하기.
	// 이렇게 메서드 완성.
	private String hobby;

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

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
	public void introduce(String food) {
		System.out.println("이름 : " + super.name + ", 취미 : " + this.hobby + " , 좋아하는 음식: " + food);

	}

	// 오버로딩, 같은 메서드 이름이지만, 정의된 매개변수의 타입, 갯수가 다른 경우.
	public void introduce(String food, String location) {
		System.out
				.println("이름 : " + super.name + ", 취미 : " + this.hobby + " , 좋아하는 음식: " + food + ", 사는곳 : " + location);

	}
	
	public void showInfo() {
		System.out
		.println("이름 : " + super.name + ", 나이 : " + super.age +  ", 취미 : " + this.hobby );
		
	}

	// 생성자 , 클래스의 속성을 초기화를 해주는 역할.
	// 기본으로 생성해주는 즉, 매개변수가 없는 생성자,
	// JinDog()
	// 주의사항, 사용자가 직접 생성자를 만든 경우, 그러면, 시스템에서, 기본 생성자를 안만들어줌.
	// 상속을 받은 경우, 자식 클래스 생성자를 이용하기전에, 먼저 
	// 부모 클래스의 생성자를 먼저 초기화(호출)를 해야합니다. 
	
	public JinDog(String hobby) {
		super();
		this.hobby = hobby;
	}
	
	public JinDog() {
		super();
	}
	
	public JinDog(String name, int age, String hobby) {
		super(name,age);
		this.hobby = hobby;
	}
	

}








