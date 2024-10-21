package ex_241021_ch3;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 배열 단순 선언만
		int intArray[];
		// 선언된 참조형 변수에 배열을 크기를 지정 정의.
		intArray = new int[5];
		int max = 0; // 현재가장큰수
		System.out.println("양수5개를입력하세요.");
		for (int i = 0; i < 5; i++) {
			// 배열에 설정하기. 값 담기. 
			intArray[i] = scanner.nextInt(); // 입력받은정수를배열에저장
			// 최대값 지정하는 간단한 원리. 
			if (intArray[i] > max)
				// max 임시 저장소 변수에 , 배열중에 큰 값을 담는 용도. 
				max = intArray[i]; // max 변경
		}
		System.out.print("가장큰수는" + max + "입니다.");
		scanner.close();
	}
}
