package ex_241021_ch4;

import java.util.jar.Attributes.Name;

// 설계도로 이용
public class Person {
	// 속성들 , 인스턴스 멤버
	String name;
	int age; 
	String [] favoriateFoods;
	
	// 기능 , 메서드 인스턴스 기능
	void introduce() {
		System.out.println("나의 이름 : "+ name + ", 나이: " + age);
	}
	
	// 기능, 좋아하는 음식 메뉴 소개.
	void introduceFoods() {
		for (String string : favoriateFoods) {
			System.out.println("내가 좋아하는 음식들: " + string);
		}
	}
	
	// 생성자: 클래스 초기화
	// 기본 생성자 자동으로 만들어줌. 
	// public Person() {}
	
	public Person() {};
	
	// 매개변수 2개인 생성자. 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 매개변수 1개인 생성자. 
		public Person(String name) {
			this.name = name;
		}
	
	// 매개변수가 3개인 생성자. 	
		public Person(String name, int age, String[] favoriateFoods) {
			super();
			this.name = name;
			this.age = age;
			this.favoriateFoods = favoriateFoods;
		}
	
}
