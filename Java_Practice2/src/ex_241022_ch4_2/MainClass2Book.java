package ex_241022_ch4_2;

public class MainClass2Book {

	// 1. 기본값의 타입을 메서드 인자로 전달 할 경우
	// 결과 -> 기본값 타입은 복사를 해서 전달하므로, 복사본이다. 원본과 별개다
	
	// 2. 참조형 타입을 메서드 인자로 전달 할 경우. 
	// 결과 -> 참조형 타입을 복사를 해서 전달하지만, 원본이다. 0x100 복사를 해도 -> 0x100 
	
	static void increase(int radius) {
		radius++;
		System.out.println("1.기본형 타입으로 받을 경우의 값 확인 : " + radius);
		
	}
	
	static void increase2(Circle circle) {
		circle.radius++;
		System.out.println("1.기본형 타입으로 받을 경우의 값 확인 : " + circle.radius);
		int result = System.identityHashCode(circle);
		System.out.println("circle 의 increase2 메서드 안에서 참조형 주소값: " + result);
		
	}
	
	static void increase3(int [] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
		System.out.println("1.기본형 타입으로 받을 경우의 값 확인 : " + array);
		for (int i : array) {
			System.out.println(i);
		}
		int result = System.identityHashCode(array);
		System.out.println("circle 의 increase2 메서드 안에서 참조형 주소값: " + result);
		
	}
	
	public static void main(String[] args) {
		// 1. 기본형. 
		int radius = 10; 
		increase(radius);
		System.out.println("원본 radius 값 확인 : " + radius);
		
		// 2. 참조형 
		Circle circle = new Circle(100);
		int result = System.identityHashCode(circle);
		System.out.println("circle 의 참조형 주소값: " + result);
		increase2(circle);
		System.out.println("2, 원본 radius 값 확인 : " + circle.radius);
		
		// 3. 참조형, 배열 
		int [] arrayInt = {1,2,3,4,5};
		int result3 = System.identityHashCode(arrayInt);
		System.out.println("arrayInt 의 참조형 주소값: " + result3);
		increase3(arrayInt);
		//원본의 변경 유무 -> 원본 변경이됨. 
		for (int i : arrayInt) {
			System.out.println(i);
		}
		
		
	}

}







