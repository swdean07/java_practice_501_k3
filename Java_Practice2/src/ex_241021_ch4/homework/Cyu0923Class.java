package ex_241021_ch4.homework;

public class Cyu0923Class {

	String name;
	int price;
	String [] material;
	
	public void introduce() {
		String materials = String.join(",", material);
        System.out.println("음식의 이름: " + name + ", 가격: " + price);
        System.out.println("음식의 재료들은 " + materials + " 등을 사용합니다.");}
	}
	
	
