package ex_241023_ch5;

class Person {
}

class Student extends Person {
}

class Researcher extends Person {
}

class Professor extends Researcher {
}

public class InstanceOfEx {
	static void print(Person p) {
		// 업캐스팅
		// Person p = student
		// Person p = researcher
		// Person p = professor
		if (p instanceof Person)
			System.out.print("Person ");
		if (p instanceof Student)
			System.out.print("Student ");
		if (p instanceof Researcher)
			System.out.print("Researcher ");
		if (p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() -> ");
		Student s1 = new Student();
		print(new Student());
		System.out.print("new Researcher() -> ");
		print(new Researcher());
		System.out.print("new Professor() -> ");
		print(new Professor());

	}
}
