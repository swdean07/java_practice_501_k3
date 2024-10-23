package ex_241022_ch4_2;

import ex_241021_ch4.Person;

public class LsyPerson extends Person {
	String hobby;

	public LsyPerson() {
		super();
	}
	
	public LsyPerson(String hobby) {
		super();
		this.hobby = hobby;
	}
	
	public void introduceHobby() {
		System.out.println("좋아하는 취미: " + this.hobby);
	}

	
}
