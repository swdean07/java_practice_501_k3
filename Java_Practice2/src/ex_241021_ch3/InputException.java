package ex_241021_ch3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		//1
		Scanner scanner = new Scanner(System.in);
		//2
		System.out.println("정수 3개를 입력하세요");
		//3
		int sum = 0, n = 0;
		//4
		for (int i = 0; i < 3; i++) {
			// 1
			System.out.print(i + ">>");
			// 2
			try {
				n = scanner.nextInt(); // 정수 입력
			} catch (InputMismatchException e) {
//				사용자가문자를입력하면
//				InputMismatchException 예외 발생
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue; // 다음 루프
			}
			//3
			sum += n; // 합하기
		}
		//5
		System.out.println("합은 " + sum);
		//6
		scanner.close();
	}
}
