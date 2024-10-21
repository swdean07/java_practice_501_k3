package ex_241021_ch3;

import java.util.Iterator;

public class ArrayRefTest {

	public static void main(String[] args) {
		// originArray , 참조형 변수 : 메모리 위치 주솟값을 저장한다. 예) 0x100 
		int [] originArray = {100,200,300};
		// copyArray , originArray 의 참조형 변수의 값을 할당. 
		int [] copyArray = originArray;
		
		int [] copyArray2 = new int[3];
		
		
		System.out.println("originArray 출력해보기. ");
		for (int i = 0; i < copyArray.length; i++) {
			System.out.println("originArray : "+ originArray[i]);
		}
		// 원본 출력 후, 0 인덱스 요소의 값을 변경. 
		// copyArray , 영향을 줌. 
		originArray[0] = 1000;
		
		// 메모리 위치의 임시 주솟값 확인. 
		System.out.println("originArray 의 메모리 임시 값 확인: ");
		System.out.println(System.identityHashCode(originArray));
		
		System.out.println("copyArray 의 메모리 임시 값 확인: ");
		System.out.println(System.identityHashCode(copyArray));
		
		System.out.println("copyArray2 의 메모리 임시 값 확인: ");
		System.out.println(System.identityHashCode(copyArray2));
		
		System.out.println();
		System.out.println("copyArray 출력해보기. ");
		for (int i = 0; i < copyArray.length; i++) {
			System.out.println("copyArray : "+ copyArray[i]);
		}
		

	}

}
