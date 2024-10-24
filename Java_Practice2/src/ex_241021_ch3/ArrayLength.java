package ex_241021_ch3;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("5개의정수를입력하세요.");
		// 배열의 정의, 크기를 설정, 기본값은 0으로 할당. 
		int intArray[] = new int[5];
		// 임시 총점을 담을 변수. 
		double sum = 0.0;
		for (int i = 0; i < intArray.length; i++)
			// 배열에 , 키보드로 입력된 숫자를 배열에 담기, 쓰기, set 
			intArray[i] = scanner.nextInt(); // 키보드에서입력받은정수저장
		for (int i = 0; i < intArray.length; i++)
			// 배열에 정의 원소를 가져오기, get, 
			sum += intArray[i]; // 배열에저장된정수값을더하기
		System.out.print("평균은" + sum / intArray.length);
		scanner.close();
	}
}
