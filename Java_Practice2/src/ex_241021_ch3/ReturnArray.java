package ex_241021_ch3;

public class ReturnArray {
	
	// 클래스 메서드, 즉, 인스턴스를 사용 안해도, 메서드를 이용가능. 
	// 전역 메서드, 
	static int[] makeArray() {
		// 매번 메서드를 실행을 하면, 새로운 배열을 만들어 냄. 
		// temp , 참조형 변수 , 반환을 메모리 위치 주솟값을 반환, 
		// 처음 만들 경우, 0x100,
		// 두번째 만들 경우, 0x200, , 서로 다른 메모리 주솟값을 표현하는 방법. 
		int temp[] = new int[4];
		int result = System.identityHashCode(temp);
		System.out.println("메서드 이용해서 만들어진 배열의 메모리 위치 주소값 임시값:");
		System.out.println(result);
		for (int i = 0; i < temp.length; i++)
			temp[i] = i; // 배열 초기화, 0, 1, 2, 3
		// 실제 temp에 저장된 값은, : 메모리 위치 주솟값이다. 
		// 0x100,
		return temp; // 배열 리턴
	}

//makeArray()가 종료해도
//생성된 배열은 소멸되지않음

	public static void main(String[] args) {
		// 임시로 받기 위한 배열, 타입 정수형. 
		int intArray[];
		
		//메서드를 이용해서, temp 라는 배열을 받기 위한 용도. 
		intArray = makeArray(); // 메소드가 리턴한 배열 참조
		// 받아서, 반복문 이용해서 출력 하는 예제, 
		int result2 = System.identityHashCode(intArray);
		System.out.println("메서드 이용해서 만들어진 배열의 메모리 위치 주소값 임시값:");
		System.out.println(result2);
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
		// 임시로 받기 위한 배열, 타입 정수형. 
		int intArray2[];
		
		//메서드를 이용해서, temp 라는 배열을 받기 위한 용도. 
		intArray2 = makeArray(); // 메소드가 리턴한 배열 참조
		// 받아서, 반복문 이용해서 출력 하는 예제, 
		int result3 = System.identityHashCode(intArray2);
		System.out.println("메서드 이용해서 만들어진 배열의 메모리 위치 주소값 임시값:");
		System.out.println(result3);
		for (int i = 0; i < intArray2.length; i++)
			System.out.print(intArray2[i] + " ");
	}
}
