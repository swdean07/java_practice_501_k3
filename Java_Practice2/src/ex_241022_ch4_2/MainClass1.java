package ex_241022_ch4_2;

public class MainClass1 {

	public static void main(String[] args) {
		// 클래스명 참조형변수 = new 생성자();
		LsyPerson lsyPerson = new LsyPerson();
		lsyPerson.name = "이상용";
		lsyPerson.age = 41;
		String [] foods = {"된장찌개","국수"};
		lsyPerson.favoriateFoods = foods;
		lsyPerson.hobby = "러닝";
		lsyPerson.introduce();
		lsyPerson.introduceFoods();
		lsyPerson.introduceHobby();
	}

}
