package ex_241021_ch4;

import java.util.jar.Attributes.Name;

public class Person {
	// 속성들 , 인스턴스 멤버
	String name;
	int age; 
	
	// 기능 , 메서드 인스턴스 기능
	void introduce() {
		System.out.println("나의 이름 : "+ name + ", 나이: " + age);
	}
	
}
