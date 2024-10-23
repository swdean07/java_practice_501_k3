package ex_241023_ch6;

public class StringTest {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "java";
		String c = "Hello";
		
		String d = new String("Hello");
		String e = new String("java");
		String f = new String("Hello");
		
		System.out.println("a : Hello ,리터럴의 임시 주솟값 : " + System.identityHashCode(a));
		System.out.println("b 리터럴의 임시 주솟값 : " + System.identityHashCode(b));
		System.out.println("c : Hello 리터럴의 임시 주솟값 : " + System.identityHashCode(c));
		System.out.println("d : Hello heap의 임시 주솟값 : " + System.identityHashCode(d));
		System.out.println("e heap의 임시 주솟값 : " + System.identityHashCode(e));
		System.out.println("f : Hello heap의 임시 주솟값 : " + System.identityHashCode(f));
		

	}

}
