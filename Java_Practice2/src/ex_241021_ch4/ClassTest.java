package ex_241021_ch4;

public class ClassTest {
	public static void main(String[] args) {
	// 클래스에서 인스턴스를 생성하는 기본 문법 
	// [클래스명] [참조형변수] = new [생성자] ();
		// 생성자는 = 클래스명과 동일
	// 참조형 변수 -> 인스턴스라고 부름. 
	// 하나의 설계 도면으로 만들어낸 객체 -> 인스턴스
	Person lsyPerson = new Person();
	lsyPerson.name = "이상용";
	lsyPerson.age = 41;
	String[] lsyPersonFavoriteFoodStrings = {"국밥","라면","된장찌개"};
	lsyPerson.favoriateFoods = lsyPersonFavoriteFoodStrings;
	lsyPerson.introduceFoods();
	
	lsyPerson.introduce();
	int result = System.identityHashCode(lsyPerson);
	System.out.println("메모리 위치 주솟값: " + result);
	
	Person lsyPerson2 = new Person();
	lsyPerson.name = "이상용2";
	lsyPerson.age = 41;
	lsyPerson.introduce();
	int result2 = System.identityHashCode(lsyPerson2);
	System.out.println("메모리 위치 주솟값: " + result2);
	
	Person lsyPerson3 = new Person("이상용",41);		
	lsyPerson3.introduce();
	
	Person lsyPerson4 = new Person("이상용");
	lsyPerson4.introduce();
	
	Person personArray[] = new Person[4];
	personArray[0] = lsyPerson; 
	personArray[1] = lsyPerson2;
	personArray[2] = lsyPerson3;
	personArray[3] = lsyPerson4;
	
	for (Person person : personArray) {
		person.introduce();
	}
	String [] foodStrings = {"국수","김밥"};
	Person lsyPerson5 = new Person("이상용", 41 ,foodStrings);
	lsyPerson5.introduce();
	lsyPerson5.introduceFoods();
	
	}
}
