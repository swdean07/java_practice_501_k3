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
		
		// 리터럴, 힙으로 만든 문자열 수정 불가능, 
		// 수정 불가능 -> 기존에 만들었던 저장공간을 사용안하고, 또다른 메모리 공간 사용을함.
		// String 변경 할 때마다, 메모리를 추가로 사용을한다. -> 낭비가 됨. 
		// 개선책. StringBuffer 
		
		String result = a + "1";
		System.out.println("result : a + \"1\" ,리터럴의 임시 주솟값 : " + System.identityHashCode(result));
		
		String result2 = d.concat("1");
		System.out.println("result2 : d.concat(\"1\") ,리터럴의 임시 주솟값 : " + System.identityHashCode(result2));

		
		// 개선한 클래스 , StringBuffer 
		StringBuffer sb = new StringBuffer("hello");
		System.out.println("sb : Hello heap의 임시 주솟값 : " + System.identityHashCode(sb));
		sb.append("1");
		System.out.println(sb.toString());
		System.out.println("sb : Hello heap의 임시 주솟값 : " + System.identityHashCode(sb));
		
	}

}





