package ex_241023_ch7.homework2;

import java.time.LocalDate;

public class Kjh0313A {
	//property
	private String name;
	private String phone;
	private LocalDate date;
	
	//constructor
	public Kjh0313A() {};
	public Kjh0313A(String name, int phone, LocalDate date) {
	this.name=name;
	this.phone=Integer.toString(phone);
	this.date = date;
	};

	
	//getter, setter
	public String getName() {
	return name;
	}
	public String getPhone() {
	return phone;
	}
	public LocalDate getDate() {
	return date;
	}

	public void setPerson(String name, int phone, LocalDate date) {
	this.name = name;
	this.phone=Integer.toString(phone);
	this.date = date;
	}
}  