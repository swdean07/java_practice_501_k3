package ex_241021_ch4;

public class ClassTest {
	public static void main(String[] args) {
	// 클래스에서 인스턴스를 생성하는 기본 문법 
	// [클래스명] [참조형변수] = new [생성자] ();
		// 생성자는 = 클래스명과 동일
	Person lsyPerson = new Person();
	lsyPerson.name = "이상용";
	lsyPerson.age = 41;
	lsyPerson.introduce();
	int result = System.identityHashCode(lsyPerson);
	System.out.println("메모리 위치 주솟값: " + result);
	
	Person lsyPerson2 = new Person();
	lsyPerson.name = "이상용2";
	lsyPerson.age = 41;
	lsyPerson.introduce();
	int result2 = System.identityHashCode(lsyPerson2);
	System.out.println("메모리 위치 주솟값: " + result2);
		
	}
}
